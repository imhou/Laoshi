package com.imhou.laoshi.decorator.flavour;

import com.imhou.laoshi.decorator.Drink;

/**
 * @author imhou
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        super.setDescription("Chocolate");
        super.setPrice(2.0f);
    }
}
