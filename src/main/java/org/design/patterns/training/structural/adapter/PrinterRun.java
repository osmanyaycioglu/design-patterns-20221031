package org.design.patterns.training.structural.adapter;

public class PrinterRun {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Employee employee = Employee.builder()
                                    .withName("osman")
                                    .withSurname("yaycıoğlu")
                                    .withGender(EGender.MALE)
                                    .build();
        printer.print(employee);

        Person person = Person.builder()
                              .withFullName("osman yaycıoğlu")
                              .withGender("MALE")
                              .build(); // Bu satırı değiştirebilirsiniz
        printer.print(person);

    }
}
