package com.goumi.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @version 1.0
 * @auther GouMi
 */
public class BallMove extends JFrame {
    BallPanel bp = null;
    public static void main(String[] args) {
        new BallMove();
    }

    public BallMove(){
        bp = new BallPanel();
        this.setSize(1000, 1000);
        this.add(bp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.addKeyListener(bp);
    }

}

class BallPanel extends JPanel implements KeyListener {

    int x, y;
    Boolean isRePaint = false;
    int speed = 8;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 100, 100);
        if (isRePaint) {
            System.out.println("重绘");
            isRePaint = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                y-=speed;
                break;
            case KeyEvent.VK_DOWN:
                y+=speed;
                break;
            case KeyEvent.VK_LEFT:
                x-=speed;
                break;
            case KeyEvent.VK_RIGHT:
                x+=speed;
                break;
            default:
                x=0;
                y=0;
        }
        isRePaint = true;
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
