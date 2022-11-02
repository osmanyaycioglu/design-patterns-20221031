package org.design.patterns.training.structural.decorator;

import java.util.List;

public class Mushroom extends Pizza {
    private Pizza pizza;

    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return pizza.price() + 10;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = pizza.getIngredients();
        ingredients.add("mushroom");
        return ingredients;
    }
}
