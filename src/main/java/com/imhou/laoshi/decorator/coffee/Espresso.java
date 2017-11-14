package com.imhou.laoshi.decorator.coffee;

import com.imhou.laoshi.decorator.Coffee;

/**
 * @author imhou
 */
public class Espresso extends Coffee{
    public Espresso(){
        super.setDescription("Espresso");
        super.setPrice(2.5f);
    }
}
