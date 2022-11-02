package org.design.patterns.training.structural.decorator;

import java.util.List;

public class Cheese extends Pizza {
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return pizza.price() + 15;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = pizza.getIngredients();
        ingredients.add("cheese");
        return ingredients;
    }
}
