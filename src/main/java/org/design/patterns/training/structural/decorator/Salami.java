package org.design.patterns.training.structural.decorator;

import java.util.List;

public class Salami extends Pizza {
    private Pizza pizza;

    public Salami(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return pizza.price() + 25;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = pizza.getIngredients();
        ingredients.add("salami");
        return ingredients;
    }
}
