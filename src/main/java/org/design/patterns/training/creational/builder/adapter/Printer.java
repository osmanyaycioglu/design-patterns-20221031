package org.design.patterns.training.creational.builder.adapter;

public class Printer {

    public void print(Employee employee) {
        if (employee.getName().startsWith("n:")){
            throw new IllegalArgumentException("isim n: ile başlayamaz");
        }
        if (employee.getGender() != null){
            if (employee.getGender() == EGender.FEMALE){
                System.out.println("Bayan " + employee.getName() + " " + employee.getSurname());
            } else if (employee.getGender() == EGender.MALE) {
                System.out.println("Bay " + employee.getName() + " " + employee.getSurname());
            } else {
                System.out.println("Sayın " + employee.getName() + " " + employee.getSurname());
            }
        } else {
            System.out.println("Sayın " + employee.getName() + " " + employee.getSurname());
        }
    }
}
