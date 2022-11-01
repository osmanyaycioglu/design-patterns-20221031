package org.design.patterns.training.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class MealCache {
    private Map<String,Meal> mealMap = new HashMap<>();

    public Meal getNewInstance(String mealName){
        Meal meal = mealMap.get(mealName);
        return meal.clone();
    }
}
