package com.imhou.laoshi.strategy.service.impl;

import com.imhou.laoshi.strategy.service.QuackBehavior;

/**
 * @author imhou
 */
public class GagaQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack gaga!");
    }
}
