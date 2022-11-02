package org.design.patterns.training.structural.adapter;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(setterPrefix = "with")
public class Person {
    private String fullName;
    private String gender;
}
