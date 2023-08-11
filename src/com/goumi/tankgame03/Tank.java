package com.goumi.tankgame03;

import java.awt.*;
import java.util.Vector;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Tank {
    private int x;
    private int y;
    private Direction direction;
    private int speed;
    private boolean isLive = true;
    private Rectangle explosionRect = null;
    private int shotsNum = 1;

    public int getShotsNum() {
        return shotsNum;
    }

    public void setShotsNum(int shotsNum) {
        shotsNum = shotsNum;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }


    public Rectangle getExplosionRect() {
        return explosionRect;
    }

    public void setExplosionRect(Rectangle explosionRect) {
        this.explosionRect = explosionRect;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Tank(int x, int y, int speed, int shotsNum) {
        this.x = x;
        this.y = y;
        this.direction = Direction.UP;
        this.speed = speed;
        this.shotsNum = shotsNum;
    }

    public void moveUp(){
        y -= 1;
    }

    public void moveDown(){
        y += 1;
    }
    public void moveLeft(){
        x -= 1;
    }
    public void moveRight(){
        x += 1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void tankShotBullet(Vector<Shot> tankShots, int disNum) {
        switch (getDirection()){
            case UP:
                Shot shotUp = new Shot(getX()+15, getY()-30*disNum, Direction.UP);
                new Thread(shotUp).start();
                tankShots.add(shotUp);
                break;
            case DOWN:
                Shot shotDown = new Shot(getX()+15, getY()+60+30*disNum, Direction.DOWN);
                new Thread(shotDown).start();
                tankShots.add(shotDown);
                break;
            case LEFT:
                Shot shotLeft = new Shot(getX()-30*disNum, getY()+15, Direction.LEFT);
                new Thread(shotLeft).start();
                tankShots.add(shotLeft);
                break;
            case RIGHT:
                Shot shotRight = new Shot(getX()+60 + 30*disNum, getY()+15, Direction.RIGHT);
                new Thread(shotRight).start();
                tankShots.add(shotRight);
                break;
        }
    }
}
