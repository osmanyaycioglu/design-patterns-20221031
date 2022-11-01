package org.design.patterns.training.creational.builder.adapter;

public class NewPrinter extends Printer {

    public void print(Person person) {
        String[] split = person.getFullName()
                               .split(" ");
        Employee employee = new Employee();
        employee.setName(split[0]);
        employee.setSurname(split[1]);
        employee.setGender(EGender.valueOf(person.getGender()));
        super.print(employee);
    }

}
