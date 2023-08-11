package com.goumi.template_;

public class BB extends Template{

    public void job(){
        //得到开始时间
        long num = 0;
        for (long i = 0; i <= 1000000000; i++) {
            num *= i;
        }
    }
}
