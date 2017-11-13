package com.imhou.laoshi.strategy;

import com.imhou.laoshi.strategy.service.impl.CantFlyBehavior;
import com.imhou.laoshi.strategy.service.impl.CantQuackBehavior;

/**
 * 石头鸭
 * @author imhou
 */
public class StoneDuck extends AbstractDuck{
    public StoneDuck(){
        flyBehavior = new CantFlyBehavior();
        quackBehavior = new CantQuackBehavior();
    }

    @Override
    void description() {
        System.out.println("Stone duck!");
    }
}
