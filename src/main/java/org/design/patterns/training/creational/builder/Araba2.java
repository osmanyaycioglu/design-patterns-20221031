package org.design.patterns.training.creational.builder;

import lombok.Builder;

@Builder(setterPrefix = "with")
public class Araba2 {
    private int speed;
    private double yakit;
    private String ismi;

}
