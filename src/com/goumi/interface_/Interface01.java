package com.goumi.interface_;

//import javafx.scene.Camera;

public class Interface01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Phone phone = new Phone();
        computer.work(phone);
    }
}
