package org.design.patterns.training.creational.prototype;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Meal {
    private String mealDescription;
    private String name;
    private String cookingDescription;

    private LocalDateTime cookEnds;
    private LocalDateTime cookStarted;

    public Meal clone(){
        Meal meal = new Meal();
        meal.mealDescription = mealDescription;
        meal.cookingDescription = cookingDescription;
        meal.name = name;
        return meal;
    }


}
