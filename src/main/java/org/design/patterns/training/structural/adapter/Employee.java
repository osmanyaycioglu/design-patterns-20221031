package org.design.patterns.training.structural.adapter;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(setterPrefix = "with")
public class Employee {
    private String name;
    private String surname;
    private EGender gender;

}
