package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.constants.Discount;

public class Apple extends Food {
    private String colour;  //

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED_COLOUR.equals(this.colour)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return Discount.NO_DISCOUNT;
    }
}

