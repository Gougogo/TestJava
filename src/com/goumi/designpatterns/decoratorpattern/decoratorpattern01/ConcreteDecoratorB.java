package com.goumi.designpatterns.decoratorpattern.decoratorpattern01;

/**
 * @version 1.0
 * @auther GouMi
 */
public class ConcreteDecoratorB extends Decorator{
    @Override
    public void Operation() {
        super.Operation();
        AddBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void AddBehavior(){

    }
}
