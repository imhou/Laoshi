package com.imhou.laoshi.strategy.service.impl;

import com.imhou.laoshi.strategy.service.QuackBehavior;

/**
 *
 * @author imhou
 */
public class CantQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Can't quack");
    }
}
