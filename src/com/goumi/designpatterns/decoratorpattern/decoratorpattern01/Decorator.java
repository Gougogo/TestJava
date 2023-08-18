package com.goumi.designpatterns.decoratorpattern.decoratorpattern01;

/**
 * @version 1.0
 * @auther GouMi
 */
abstract public class Decorator implements Component{
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (component != null){
            component.Operation();
        }
    }
}
