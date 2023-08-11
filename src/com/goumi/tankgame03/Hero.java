package com.goumi.tankgame03;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Hero extends Tank{
    public Hero(int x, int y, int speed, int shotNums) {
        super(x, y, speed, shotNums);
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
