package com.imhou.laoshi.strategy;

import com.imhou.laoshi.strategy.service.FlyBehavior;
import com.imhou.laoshi.strategy.service.QuackBehavior;

/**
 * 策略模式鸭子
 * @author imhou
 */
public abstract class AbstractDuck {

    AbstractDuck(){
        description();
    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * 用于描述自身的方法
     */
    abstract void description();

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }
}
