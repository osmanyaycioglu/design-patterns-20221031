package org.design.patterns.training.structural.adapter;

import org.design.patterns.training.structural.proxy.PrinterProxy;

public class PrinterRun {


    public static void main(String[] args) {
        Printer printer = new PrinterProxy(); // bu satırı değiştirerek
        Employee employee = Employee.builder()
                                    .withName("osman")
                                    .withSurname("yaycıoğlu")
                                    .withGender(EGender.MALE)
                                    .build();
        printer.print(employee);

        Person person = Person.builder()
                              .withFullName("osman yaycıoğlu")
                              .withGender("MALE")
                              .build();

//        String[] split = person.getFullName()
//                               .split(" ");
//        Employee employee1 = new Employee();
//        employee1.setName(split[0]);
//        employee1.setSurname(split[1]);
//        employee1.setGender(EGender.valueOf(person.getGender()));
//        printer.print(employee1);
        Person person1 = Person.builder()
                             .withFullName("osman yaycıoğlu")
                             .withGender("MALE")
                             .build();
        Employee personAdapter = new PersonToEmployeeAdapter(person1); // Bu satırı değiştirebilirsiniz
        printer.print(personAdapter);


        NewPrinter newPrinter = new NewPrinter();
        newPrinter.print(person1);
        newPrinter.print(employee);
    }
}
