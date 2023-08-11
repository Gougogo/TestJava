package com.goumi.template_;

public class AA extends Template{

    public void job(){//实现抽象方法
        long num = 0;
        for (long i = 0; i <= 1000000000; i++) {
            num+=i;
        }
    }
}
