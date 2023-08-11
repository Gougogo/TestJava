package com.goumi.reflection;

public class Cat {
    public Cat(){

    }

    public Cat(String name, String age){
        this.name = name;
        this.age = age;
    }
    private String name = "猫咪";
    public String age = "15";
    public static String sex = "girl";
    public void hi(){
        System.out.println("hi" + name);
    }

    public void cry(String content){
        System.out.println("cry" + name + content);
    }
}
