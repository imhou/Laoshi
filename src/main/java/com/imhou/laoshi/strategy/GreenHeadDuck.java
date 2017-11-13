package com.imhou.laoshi.strategy;

import com.imhou.laoshi.strategy.service.impl.GagaQuackBehavior;
import com.imhou.laoshi.strategy.service.impl.GoodFlyBehavior;

/**
 * @author imhou
 */
public class GreenHeadDuck extends AbstractDuck{
    public GreenHeadDuck(){
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GagaQuackBehavior();
    }

    @Override
    void description() {
        System.out.println("Green head duck!");
    }
}
