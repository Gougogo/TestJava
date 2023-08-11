package com.goumi.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @version 1.0
 * @auther GouMi
 */
public class MyPanel extends JPanel implements KeyListener {
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100, 100);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        //drawTank(hero.getX(), hero.getY(), g, 0, 0);
        drawTank(hero.getX(), hero.getY(), g, 0, 1);
    }

    public void drawTank(int x, int y, Graphics g, int direct, int type){
        switch (type){
            case 0:
                g.setColor(Color.CYAN);
                break;
            case 1:
                g.setColor(Color.YELLOW);
                break;
        }

        switch (direct){
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x+30, y, 10, 60, false);
                g.fill3DRect(x+10, y+10, 20, 40, false);
                g.fillOval(x+10, y+20, 20, 20);
                g.drawLine(x+20, y+30, x+20, y);
            default:
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
