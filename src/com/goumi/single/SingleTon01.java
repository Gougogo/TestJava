package com.goumi.single;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend xiaoming = GirlFriend.getInstance("小张");

        xiaoming.printName();

        System.out.println(GirlFriend.n1);

        new GirlFriend();
    }
}

class GirlFriend{
    private String name;

    public static int n1 = 100;

    private static GirlFriend gf = new GirlFriend();

    /*//构造器私有化
    private GirlFriend(String name){
        this.name = name;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance(String name){
        gf.setName(name);
        return gf;
    }

    public void printName(){
        System.out.println(name);
    }
}
