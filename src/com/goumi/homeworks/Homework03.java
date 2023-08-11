package com.goumi.homeworks;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Homework03 {
}

class Frock{
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }
}

