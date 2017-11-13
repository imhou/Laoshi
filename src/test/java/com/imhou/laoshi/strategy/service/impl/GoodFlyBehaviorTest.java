package com.imhou.laoshi.strategy.service.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoodFlyBehaviorTest {

    @Test
    public void fly() throws Exception {

        GoodFlyBehavior goodFlyBehavior = new GoodFlyBehavior();
        goodFlyBehavior.fly();
    }

}