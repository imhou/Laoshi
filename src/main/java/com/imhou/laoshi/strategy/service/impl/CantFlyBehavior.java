package com.imhou.laoshi.strategy.service.impl;

import com.imhou.laoshi.strategy.service.FlyBehavior;

/**
 *
 * @author imhou
 */
public class CantFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Can't fly!");
    }
}
