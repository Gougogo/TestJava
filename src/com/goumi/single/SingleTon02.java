package com.goumi.single;

public class SingleTon02 {
    public static void main(String[] args) {
        //Cat instance = Cat.getInstance("小王");
        //System.out.println(instance.n1);
        //System.out.println(instance);

        //Cat instance1 = Cat.getInstance("小李");
        //System.out.println(instance == instance1);
        //System.out.println(instance);

        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println((double) (Runtime.getRuntime().totalMemory()) / (1024 * 1024 * 1024));

        new Cat();
        Cat asd;

        Cat instance = Cat.getInstance("asd");
    }
}

class Cat{
    private String name;
    private static Cat cat;
    public static int n1 = 199;
    Cat(){

    }

    private Cat(String name) {
        System.out.println("cat构造函数被调用");
        this.name = name;
    }

    public static Cat getInstance(String name){
        if (cat == null){
            cat = new Cat(name);
        }

        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}