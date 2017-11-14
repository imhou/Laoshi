package com.imhou.laoshi.decorator.flavour;

import com.imhou.laoshi.decorator.Drink;

/**
 * @author imhou
 */
public class Soy extends Decorator{
    public Soy(Drink obj) {
        super(obj);
        super.setDescription("Soy");
        super.setPrice(1.5f);
    }
}
