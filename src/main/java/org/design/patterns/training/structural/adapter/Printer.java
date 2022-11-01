package org.design.patterns.training.structural.adapter;

public class Printer {

    public void print(Employee employee) {
        if (employee.getGender() == EGender.FEMALE){
            System.out.println("Bayan " + employee.getName() + " " + employee.getSurname());
        } else {
            System.out.println("Bay " + employee.getName() + " " + employee.getSurname());
        }
    }
}
