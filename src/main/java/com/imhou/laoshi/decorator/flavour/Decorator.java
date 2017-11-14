package com.imhou.laoshi.decorator.flavour;

import com.imhou.laoshi.decorator.Drink;

/**
 * @author imhou
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDescription(){
        System.out.println("---------" + this.description + "========");
        return super.description + " - " + super.getPrice() + "  &&  " + obj.getDescription();
    }
}
