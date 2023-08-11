package com.goumi.tankgame03;

import java.awt.*;

/**
 * @version 1.0
 * @auther GouMi
 */
public class DrawDirectionTank {
    public static void downTank(int x, int y, Graphics g){
        g.fill3DRect(x, y, 10, 60, false);
        g.fill3DRect(x+30, y, 10, 60, false);
        g.fill3DRect(x+10, y+10, 20, 40, false);
        g.fillOval(x+10, y+20, 20, 20);
        g.drawLine(x+20, y+30, x+20, y+60);
    }

    public static void upTank(int x, int y, Graphics g){
        g.fill3DRect(x, y, 10, 60, false);
        g.fill3DRect(x+30, y, 10, 60, false);
        g.fill3DRect(x+10, y+10, 20, 40, false);
        g.fillOval(x+10, y+20, 20, 20);
        g.drawLine(x+20, y+30, x+20, y);
    }

    public static void leftTank(int x, int y, Graphics g){
        g.fill3DRect(x, y, 60, 10, false);
        g.fill3DRect(x, y+30, 60, 10, false);
        g.fill3DRect(x+10, y+10, 40, 20, false);
        g.fillOval(x+20, y+10, 20, 20);
        g.drawLine(x, y+20, x+30, y+20);
    }

    public static void rightTank(int x, int y, Graphics g){
        g.fill3DRect(x, y, 60, 10, false);
        g.fill3DRect(x, y+30, 60, 10, false);
        g.fill3DRect(x+10, y+10, 40, 20, false);
        g.fillOval(x+20, y+10, 20, 20);
        g.drawLine(x+30, y+20, x+60, y+20);
    }
}
