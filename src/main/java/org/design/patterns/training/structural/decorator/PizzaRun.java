package org.design.patterns.training.structural.decorator;

public class PizzaRun {
    public static void main(String[] args) {
        Pizza pizza = new Cheese(new Salami(new Mushroom(new Caprica(new Cheese(new BigPizza().setPastaryType("kalın hamur"))))));
        System.out.println(pizza.price() + " TL içindekiler : " + pizza.getIngredients());
    }
}
