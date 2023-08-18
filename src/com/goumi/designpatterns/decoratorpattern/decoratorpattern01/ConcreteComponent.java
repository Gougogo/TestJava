package com.goumi.designpatterns.decoratorpattern.decoratorpattern01;

/**
 * @version 1.0
 * @auther GouMi
 */
public class ConcreteComponent implements Component{
    @Override
    public void Operation() {
        System.out.println("具体对象的操作");
    }
}
