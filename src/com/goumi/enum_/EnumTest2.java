package com.goumi.enum_;

/**
 * @version 1.0
 * @auther GouMi
 */

@SuppressWarnings("all")
public class EnumTest2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < Week.values().length; i++) {
            System.out.println(Week.values()[i]);
        }

        Thread.sleep(10000);
    }
}

@SuppressWarnings("all")
enum Week{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日")
    ;
    private String name;

    private Week(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
