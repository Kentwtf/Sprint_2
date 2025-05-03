package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {

    public static Food[] foods;

    public ShoppingCart(Food[] foods) {
        ShoppingCart.foods = foods != null ? foods : new Food[0];
    }

    public static double calculateDiscountedTotal() {
        double totalPrice = 0.0;
        for (int i = 0; i < foods.length; i++) {
            double itemPrice = foods[i].getAmount() * foods[i].getPrice();
            double itemDiscount = itemPrice * foods[i].getDiscount();
            totalPrice += itemPrice - itemDiscount;
        }
        return totalPrice;
    }

    public static double calculateFullPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < foods.length; i++) {
            totalPrice += foods[i].getAmount() * foods[i].getPrice();
        }
        return totalPrice;
    }

    public static double calculateVegetarianTotal() {
        double vegetarianTotal = 0.0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].getIsVegetarian()) {
                vegetarianTotal += foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return vegetarianTotal;
    }
}
