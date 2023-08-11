package com.goumi.tankgame03;

/**
 * @version 1.0
 * @auther GouMi
 */
public enum Direction {
        UP(0),
        DOWN(1),
        LEFT(2),
        RIGHT(3);

        int type;

        Direction(int type) {
            this.type = type;
        }
}
