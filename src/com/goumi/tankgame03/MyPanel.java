package com.goumi.tankgame03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.Vector;
import java.util.Timer;

/**
 * @version 1.0
 * @auther GouMi
 */
@SuppressWarnings({"all"})
public class MyPanel extends JPanel implements KeyListener {
    Vector<EnemyTank> enemyTanks = new Vector<>();
    Vector<Shot> enemyShots = new Vector<>();
    Vector<Shot> heroShots = new Vector<Shot>();
    int life = 30; //炸弹的生命周期
    boolean isLive = true; //是否还存活
    Vector<Bomb> bombs = new Vector<>();//炸弹位置
    Vector<Rectangle> Obstacles = new Vector<>();

    int heroLimitShotNum = 5;

    enum TankType{
        HERO(0),
        ENEMY(1);

        int type;

        TankType(int type) {
            this.type = type;
        }
    }

    int enemyTankSize = 3;
    Hero hero;

    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public Hero getHero() {
        return hero;
    }

    public MyPanel(){
        hero = new Hero(100, 100, 10, 3);

        //生成障碍物
        paintObstacle();

        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(300 * (i + 1), 800, 15, 2);
            setTankDirection(enemyTank, (int)(Math.random()*(4)));
            enemyTank.setObstacle(Obstacles);
            enemyTanks.add(enemyTank);
            new Thread(enemyTank).start();
        }

        //初始化炸弹图片
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.png"));

        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.png"));

        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.png"));

        // 创建一个定时任务，多次击发子弹
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // 在这里编写定时执行的任务逻辑
                //定时转向
                for (EnemyTank enemyTank : enemyTanks) {
                    int i = (int) (Math.random() * (4));
                    setTankDirection(enemyTank, i);
                }

                //定时发射子弹
                for (int i = 0; i < enemyTankSize; i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    for (int j = 0; j < enemyTank.getShotsNum(); j++) {
                        enemyTank.tankShotBullet(enemyShots, j);
                    }
                }
            }
        };

        // 定义延迟时间和执行周期
        long delay = 1000; // 延迟1秒执行
        long period = 2000; // 每2秒执行一次

        // 启动定时器
        timer.scheduleAtFixedRate(task, delay, period);
    }

    public void setTankDirection(Tank tank, int dir){
        switch (dir){
            case 0:
                tank.setDirection(Direction.UP);
                break;
            case 1:
                tank.setDirection(Direction.DOWN);
                break;
            case 2:
                tank.setDirection(Direction.LEFT);
                break;
            case 3:
                tank.setDirection(Direction.RIGHT);
                break;
        }
    }

    public void paintObstacle(){
        Obstacles.add(new Rectangle(1000, 30, 200, 20));
        Obstacles.add(new Rectangle(100, 1000, 20, 200));
        Obstacles.add(new Rectangle(500, 570, 200, 20));
        Obstacles.add(new Rectangle(1000, 1000, 200, 20));
    }

    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0, 0, 2000, 1500);

        g.setColor(Color.BLUE);
        //绘制障碍物
        for (Rectangle obstacle : Obstacles) {
            g.fillRect(obstacle.x, obstacle.y, obstacle.width, obstacle.height);
        }

        //绘制敌人坦克
        Iterator<EnemyTank> iterator = enemyTanks.iterator();
        while (iterator.hasNext()){
            EnemyTank tank = iterator.next();
            //绘制敌方坦克
            if (tank.isLive())
                drawTank(tank.getX(), tank.getY(), g, tank.getDirection(), TankType.ENEMY);
            //计算敌方坦克区域
            calTankRect(tank);
            //敌方坦克碰撞就改变方向
            for (EnemyTank enemyTank : enemyTanks) {
                if (enemyTank == tank){
                    break;
                }

                if (enemyTank.getExplosionRect().intersects(tank.getExplosionRect())){
                    changeTankDir(enemyTank);
                    changeTankDir(tank);
                }
            }
        }

        //绘制敌方子弹
        for (Shot enemyShot : enemyShots) {
            int x = enemyShot.getX();
            int y = enemyShot.getY();
            Point point = new Point(x, y);
            if (enemyShot.isLive) {
                //击中我方坦克
                Rectangle explosionRect = hero.getExplosionRect();
                if (bulletHitRect(explosionRect, point)) {
                    bombs.add(new Bomb(x, y));
                    hero.setLive(false);
                    enemyShot.isLive = false;
                    enemyShots.remove(enemyShot);
                }
                //击中障碍物
                for (Rectangle obstacle : Obstacles) {
                    if (bulletHitRect(obstacle, point)){
                        enemyShot.isLive = false;
                        enemyShots.remove(enemyShot);
                    }
                }
                g.setColor(Color.YELLOW);
                g.fillOval(x, y, 10, 10);
            }else{
                //注意这里会报集合多线程问题的错误。因为多个线程可能同时对集合进行了修改。
                enemyShots.remove(enemyShot);
            }
        }

        if (hero.isLive()) {
            //绘制我方坦克
            drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), TankType.HERO);
            //计算我方坦克碰撞区域
            calTankRect(hero);
            //我方坦克和敌方坦克碰撞，我方坦克销毁
            for (EnemyTank enemyTank : enemyTanks) {
                if (enemyTank.getExplosionRect().intersects(hero.getExplosionRect())) {
                    enemyTank.setLive(false);
                    enemyTanks.remove(enemyTank);
                }
            }
        }
        else {
            hero.setExplosionRect(new Rectangle(0, 0));
        }

        //绘制我方子弹
        Iterator<Shot> iterator3 = heroShots.iterator();
        while (iterator3.hasNext()){
            Shot heroShot = iterator3.next();
            int x = heroShot.getX();
            int y = heroShot.getY();
            Point point = new Point(x, y);
            Iterator<EnemyTank> iterator4 = enemyTanks.iterator();
            while (iterator4.hasNext()){
                EnemyTank enemyTank = iterator4.next();
                Rectangle explosionRect = enemyTank.getExplosionRect();
                //击中敌方坦克
                if (bulletHitRect(explosionRect, new Point(x, y))) {
                    heroShot.isLive = false;
                    enemyTankSize--;
                    enemyTanks.remove(enemyTank);
                    enemyTank.setLive(false);
                    bombs.add(new Bomb(x, y));
                }
            }

            //击中障碍物
            for (Rectangle obstacle : Obstacles) {
                if (bulletHitRect(obstacle, point)){
                    heroShot.isLive = false;
                    heroShots.remove(heroShot);
                }
            }

            if (heroShot.isLive) {
                g.setColor(Color.CYAN);
                g.fillOval(x, y, 10, 10);
            }else {
                heroShots.remove(heroShot);
            }
        }

        //绘制爆炸效果
        Iterator<Bomb> iterator5 = bombs.iterator();
        while (iterator5.hasNext()){
            Bomb bomb = iterator5.next();
            if (bomb.life > 40)
                g.drawImage(image1, bomb.x, bomb.y, 50, 50, this);
            else if(bomb.life > 20)
                g.drawImage(image2, bomb.x, bomb.y, 50, 50, this);
            else
                g.drawImage(image3, bomb.x, bomb.y, 50, 50, this);

            bomb.lifeDown();

            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }
    }

    public void changeTankDir(Tank tank){
        switch (tank.getDirection()){
            case UP:
                tank.setDirection(Direction.DOWN);
                break;
            case DOWN:
                tank.setDirection(Direction.UP);
                break;
            case LEFT:
                tank.setDirection(Direction.RIGHT);
                break;
            case RIGHT:
                tank.setDirection(Direction.LEFT);
                break;
        }
    }

    public void calTankRect(Tank tank){
        switch (tank.getDirection()) {
            case UP:
                tank.setExplosionRect(new Rectangle(tank.getX(), tank.getY(), 40, 60));
                break;
            case DOWN:
                tank.setExplosionRect(new Rectangle(tank.getX(), tank.getY(), 40, 60));
                break;
            case LEFT:
                tank.setExplosionRect(new Rectangle(tank.getX(), tank.getY(), 60, 40));
                break;
            case RIGHT:
                tank.setExplosionRect(new Rectangle(tank.getX(), tank.getY(), 60, 40));
                break;
            default:
        }
    }

    public boolean tankHitObstacle(Tank tank, Rectangle obst, int len){
        Rectangle explosionRect = tank.getExplosionRect();
        Rectangle rectangle = null;
        switch (tank.getDirection())
        {
            case UP:
                rectangle = new Rectangle(explosionRect.x, explosionRect.y - len, explosionRect.width, explosionRect.height);
                break;
            case DOWN:
                rectangle = new Rectangle(explosionRect.x, explosionRect.y + len, explosionRect.width, explosionRect.height);
                break;
            case LEFT:
                rectangle = new Rectangle(explosionRect.x - len, explosionRect.y, explosionRect.width, explosionRect.height);
                break;
            case RIGHT:
                rectangle = new Rectangle(explosionRect.x + len, explosionRect.y, explosionRect.width, explosionRect.height);
                break;
        }

        if (rectangle.intersects(obst)) {
            //System.out.println("碰撞");
            return true;
        }
        else {
            return false;
        }
    }

    public boolean bulletHitRect(Rectangle rect, Point pnt){
        if(rect.contains(pnt)) {
            return true;
        }else
        {
            return false;
        }
    }

    public void drawTank(int x, int y, Graphics g, Direction direct, TankType type){
        switch (type){
            case HERO:
                g.setColor(Color.CYAN);
                break;
            case ENEMY:
                g.setColor(Color.YELLOW);
                break;
        }

        switch (direct) {
            case UP:
                DrawDirectionTank.upTank(x, y, g);
                break;
            case DOWN:
                DrawDirectionTank.downTank(x, y, g);
                break;
            case LEFT:
                DrawDirectionTank.leftTank(x, y, g);
                break;
            case RIGHT:
                DrawDirectionTank.rightTank(x, y, g);
                break;
            default:
        }

        this.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                if (hero.getY()<=0){
                    break;
                }
                hero.setDirection(Direction.UP);
                for (Rectangle obstacle : Obstacles) {
                    if(tankHitObstacle(hero, obstacle, hero.getSpeed()*2)) {
                        return;
                    }
                }

                if (hero.getDirection() == Direction.UP)
                    hero.moveUp();

                System.out.println("上移");
                break;
            case KeyEvent.VK_DOWN:
                if (hero.getY()>=(1500-60)){
                    break;
                }
                hero.setDirection(Direction.DOWN);
                for (Rectangle obstacle : Obstacles) {
                    if(tankHitObstacle(hero, obstacle, hero.getSpeed()*2)) {
                        return;
                    }
                }

                if (hero.getDirection() == Direction.DOWN)
                    hero.moveDown();

                break;
            case KeyEvent.VK_LEFT:
                if (hero.getX()<=0){
                    break;
                }
                hero.setDirection(Direction.LEFT);
                for (Rectangle obstacle : Obstacles) {
                    if(tankHitObstacle(hero, obstacle, hero.getSpeed()*2)) {
                        return;
                    }
                }
                if (hero.getDirection() == Direction.LEFT)
                    hero.moveLeft();

                break;
            case KeyEvent.VK_RIGHT:
                if (hero.getX()>=(2000-60)){
                    break;
                }
                hero.setDirection(Direction.RIGHT);
                for (Rectangle obstacle : Obstacles) {
                    if(tankHitObstacle(hero, obstacle, hero.getSpeed()*2)) {
                        return;
                    }
                }
                if (hero.getDirection() == Direction.RIGHT)
                    hero.moveRight();

                break;
            case KeyEvent.VK_J:
                //最多有多少发子弹存在于面板上
                if (heroShots.size() >= heroLimitShotNum * hero.getShotsNum()){
                    break;
                }
                int shotsNum = hero.getShotsNum();
                for (int i = 0; i < shotsNum; i++) {
                    hero.tankShotBullet(heroShots, i);
                }
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
