package com.goumi.tankgame02;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Hero extends Tank {
    private int speed;
    public Hero(int x, int y, int speed) {
        super(x, y);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void moveUp() {
        this.setY(this.getY() - speed);
    }

    @Override
    public void moveDown() {
        this.setY(this.getY() + speed);
    }

    @Override
    public void moveLeft() {
        this.setX(this.getX() - speed);
    }

    @Override
    public void moveRight() {
        this.setX(this.getX() + speed);
    }
}
