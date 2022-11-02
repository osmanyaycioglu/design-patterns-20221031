package org.design.patterns.training.structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String pastaryType;

    public int price(){
        return 30;
    }

    public List<String> getIngredients(){
        List<String> ingre = new ArrayList<>();
        ingre.add(pastaryType);
        return ingre;
    }

    public Pizza setPastaryType(String pastaryType) {
        this.pastaryType = pastaryType;
        return this;
    }
}
