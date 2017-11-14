package com.imhou.laoshi.decorator.flavour;

import com.imhou.laoshi.decorator.Drink;

/**
 * @author imhou
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        super.setDescription("Milk");
        super.setPrice(1.0f);
    }
}
