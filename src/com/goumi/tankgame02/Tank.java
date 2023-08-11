package com.goumi.tankgame02;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Tank {
    private int x;
    private int y;
    private int direction;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = 0;
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

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
