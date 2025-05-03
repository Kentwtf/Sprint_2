package ru.yandex.praktikum;

import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100.0);
        Apple redApple = new Apple(10, 50, Colour.RED_COLOUR);
        Apple greenApple = new Apple(8, 60, Colour.GREEN_COLOUR);
        ShoppingCart.foods = new Food[] {meat, redApple, greenApple};

        System.out.println("Общая сумма товаров без скидки: " + ShoppingCart.calculateFullPrice());
        System.out.println("Общая сумма товаров со скидкой: " + ShoppingCart.calculateDiscountedTotal());
        System.out.println("Cумма всех вегетарианских продуктов без скидки: " + ShoppingCart.calculateVegetarianTotal());
    }
}