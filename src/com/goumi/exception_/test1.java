package com.goumi.exception_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class test1 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getValue());//输出17
        System.out.println(b);


    }
    static class A {
        protected int value;//10->22
        public A (int v) {
            this.setValue(v);
            System.out.println(this);
        }
        public void setValue(int value) {
            this.value= value;//22->16->34
            System.out.println(this);
        }
        public int getValue() {
            try {
                value ++;//11->17
                return value;//返回11//返回17
            } finally {
                this.setValue(value);
                System.out.println(this);
                System.out.println(value);//输出22->输出34
                this.value = 100;
            }
        }
    }
    static class B extends A {
        public B () {
            super(5);
            setValue(getValue()- 3);//getValue()- 3等于11-3=8
        }
        public void setValue(int value) {
            super.setValue(2 * value);//参数为16
        }
    }
}



