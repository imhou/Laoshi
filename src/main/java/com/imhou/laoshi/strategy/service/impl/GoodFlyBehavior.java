package com.imhou.laoshi.strategy.service.impl;

import com.imhou.laoshi.strategy.service.FlyBehavior;

/**
 * @author imhou
 */
public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly good!");
    }
}
