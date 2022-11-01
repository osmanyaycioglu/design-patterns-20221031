package org.design.patterns.training.creational.builder.adapter;

public class PersonToEmployeeAdapter extends Employee {

    public PersonToEmployeeAdapter(Person person) {
        String[] split = person.getFullName()
                           .split(" ");
        setName(split[0]);
        setSurname(split[1]);
        setGender(EGender.valueOf(person.getGender()));
    }
}
