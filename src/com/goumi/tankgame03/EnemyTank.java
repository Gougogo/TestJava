package com.goumi.tankgame03;

import java.awt.*;
import java.util.Vector;

/**
 * @version 1.0
 * @auther GouMi
 */
public class EnemyTank extends Tank implements Runnable{
    Vector<Rectangle> obstacle;

    public EnemyTank(int x, int y, int speed, int enemyShotsNum) {
        super(x, y, speed, enemyShotsNum);
    }

    public void setObstacle(Vector<Rectangle> obstacle) {
        this.obstacle = obstacle;
    }

    public boolean tankHitObstacle(){
        for (Rectangle obstacleRect : obstacle) {
            Rectangle rectangle = null;
            switch (getDirection())
            {
                case UP:
                    rectangle = new Rectangle(getX(), getY() - getSpeed(), getExplosionRect().width, getExplosionRect().height);
                    break;
                case DOWN:
                    rectangle = new Rectangle(getX(), getY()  + getSpeed(), getExplosionRect().width, getExplosionRect().height);
                    break;
                case LEFT:
                    rectangle = new Rectangle(getX() - getSpeed(), getY(), getExplosionRect().width, getExplosionRect().height);
                    break;
                case RIGHT:
                    rectangle = new Rectangle(getX() + getSpeed(), getY(), getExplosionRect().width, getExplosionRect().height);
                    break;
            }

            if (rectangle.intersects(obstacleRect)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (getDirection()){
                case UP:
                    moveUp();
                    if (getY()<=0 || tankHitObstacle()) {
                        setDirection(Direction.DOWN);
                    }
                    break;
                case DOWN:
                    moveDown();
                    if (getY()>=(1500-60) || tankHitObstacle()) {
                        setDirection(Direction.UP);
                    }
                    break;
                case LEFT:
                    moveLeft();
                    if (getX()<=0 || tankHitObstacle()) {
                        setDirection(Direction.RIGHT);
                    }
                    break;
                case RIGHT:
                    moveRight();
                    if (getX()>=(2000-60) || tankHitObstacle()) {
                        setDirection(Direction.LEFT);
                    }
                    break;
            }

            if (!isLive()) {
                break; //退出线程.
            }
        }
    }

    @Override
    public void moveUp() {
        this.setY(this.getY() - getSpeed());
    }

    @Override
    public void moveDown() {
        this.setY(this.getY() + getSpeed());
    }

    @Override
    public void moveLeft() {
        this.setX(this.getX() - getSpeed());
    }

    @Override
    public void moveRight() {
        this.setX(this.getX() + getSpeed());
    }
}
