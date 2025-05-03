package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Discount;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;


    public int getAmount() {
        return this.amount;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getIsVegetarian() {
        return this.isVegetarian;
    }

    @Override
    public double getDiscount() {
        return Discount.NO_DISCOUNT;
    }
}