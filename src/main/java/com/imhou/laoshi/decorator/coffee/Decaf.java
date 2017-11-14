package com.imhou.laoshi.decorator.coffee;

import com.imhou.laoshi.decorator.Coffee;

/**
 * @author imhou
 */
public class Decaf extends Coffee{
    public Decaf(){
        super.setDescription("Decaf");
        super.setPrice(3.0f);
    }
}
