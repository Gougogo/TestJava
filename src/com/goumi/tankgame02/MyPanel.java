package com.goumi.tankgame02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @version 1.0
 * @auther GouMi
 */
public class MyPanel extends JPanel implements KeyListener {
    Vector<EnemyTank> tanks = new Vector<>();

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

    public Hero getHero() {
        return hero;
    }

    public MyPanel(){
        hero = new Hero(100, 100, 10);

        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirection(1);
            tanks.add(enemyTank);
        }
    }

    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0, 0, 2000, 1500);

        Iterator<EnemyTank> iterator = tanks.iterator();
        while (iterator.hasNext()){
            EnemyTank next = iterator.next();
            drawTank(next.getX(), next.getY(), g, next.getDirection(), TankType.ENEMY);
        }


        drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), TankType.HERO);
    }

    public void drawTank(int x, int y, Graphics g, int direct, TankType type){
        switch (type){
            case HERO:
                g.setColor(Color.CYAN);
                break;
            case ENEMY:
                g.setColor(Color.YELLOW);
                break;
        }

        switch (direct) {
            case 0:
                DrawDirectionTank.upTank(x, y, g);
                break;
            case 1:
                DrawDirectionTank.downTank(x, y, g);
                break;
            case 2:
                DrawDirectionTank.leftTank(x, y, g);
                break;
            case 3:
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
                hero.moveUp();
                hero.setDirection(0);
                break;
            case KeyEvent.VK_DOWN:
                hero.moveDown();
                hero.setDirection(1);
                break;
            case KeyEvent.VK_LEFT:
                hero.moveLeft();
                hero.setDirection(2);
                break;
            case KeyEvent.VK_RIGHT:
                hero.moveRight();
                hero.setDirection(3);
                break;
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
