package com.goumi.designpatterns.decoratorpattern.decoratorpattern01;

/**
 * @version 1.0
 * @auther GouMi
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
        d1.setComponent(c);
        d2.setComponent(d1);

        d2.Operation();
    }
}
