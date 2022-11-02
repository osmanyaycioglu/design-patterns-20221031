package org.design.patterns.training.structural.decorator;

import java.util.List;

public class Caprica extends Pizza {
    private Pizza pizza;

    public Caprica(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return pizza.price() + 10;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = pizza.getIngredients();
        ingredients.add("caprica");
        return ingredients;
    }
}
