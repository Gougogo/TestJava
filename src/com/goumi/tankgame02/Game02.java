package com.goumi.tankgame02;

import javax.swing.*;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Game02 extends JFrame {

    MyPanel mp = null;

    public static void main(String[] args) {
        new Game02();
    }

    public Game02(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(2000, 1500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(mp);
    }
}
