package com.goumi.single;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = new GirlFriend();
        GirlFriend instance1 = new GirlFriend();

        System.out.println(instance.getInstance() == instance1.getInstance());

        System.out.println(instance==GirlFriend.gf);
    }
}

class GirlFriend{
    public static int n1 = 100;

    public static GirlFriend gf = new GirlFriend();

    public GirlFriend getInstance(){
        return gf;
    }
}
