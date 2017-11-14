package com.imhou.laoshi.decorator;

/**
 * @author imhou
 */
public abstract class Drink {

    public String description = "";
    public float  price       = 0f;

    public String getDescription() {
        return description + " - " + this.getPrice();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 最终花费价格
     * @return
     */
    public abstract float cost();
}
