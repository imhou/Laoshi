package com.imhou.laoshi.decorator;

/**
 * @author imhou
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
