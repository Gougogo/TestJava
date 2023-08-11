package com.goumi.tankgame03;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Shot implements Runnable{
    private int x;
    private int y;
    private Direction direct = Direction.UP;
    private int speed = 10;
    boolean isLive = true;

    public Shot(int x, int y, Direction direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (direct){
                case UP:
                    y -= speed;
                    break;
                case DOWN:
                    y += speed;
                    break;
                case LEFT:
                    x -= speed;
                    break;
                case RIGHT:
                    x += speed;
                    break;
            }

            if (!(x>=0 && x<=2000 && y>=0 && y<=1500 && isLive)){
                isLive = false;
                break;
            }
        }
    }
}
