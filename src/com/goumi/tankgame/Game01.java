package com.goumi.tankgame;

import javax.swing.*;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Game01 extends JFrame {

    MyPanel mp = null;

    public static void main(String[] args) {
        new Game01();
    }

    public Game01(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
