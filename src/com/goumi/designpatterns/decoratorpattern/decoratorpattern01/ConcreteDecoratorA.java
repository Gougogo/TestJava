package com.goumi.designpatterns.decoratorpattern.decoratorpattern01;

/**
 * @version 1.0
 * @auther GouMi
 */
public class ConcreteDecoratorA extends Decorator{
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState = "new state";
        System.out.println("具体装饰对象A的操作");
    }
}
