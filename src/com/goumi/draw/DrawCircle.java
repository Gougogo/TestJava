package com.goumi.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.0
 * @auther GouMi
 */
public class DrawCircle extends JFrame{
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //g.drawOval(10, 10, 100, 100);

        //g.setColor(Color.RED);
        //g.fillRect(10, 10, 100, 100);
        // /bg.png表示在项目的根目录中获取
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
        g.drawImage(image, 10, 10, 175, 221, this);
    }
}
