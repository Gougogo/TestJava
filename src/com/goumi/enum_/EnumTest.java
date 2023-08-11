package com.goumi.enum_;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @version 1.0
 * @auther GouMi
 */
public class EnumTest {
    public static void main(String[] args) {
        Season.AUTUMN.setName("asd");
        System.out.println(Season.AUTUMN.getName());

    }

}

class Season{
    private String name;
    private String desc;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }

    private Season(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷");


    public void testFinal(){
        AUTUMN = new Season("asd", "asd");
    }
}
