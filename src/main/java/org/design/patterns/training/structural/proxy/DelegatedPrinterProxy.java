package org.design.patterns.training.structural.proxy;

import org.design.patterns.training.creational.builder.adapter.Employee;
import org.design.patterns.training.creational.builder.adapter.Printer;

public class DelegatedPrinterProxy extends Printer {

    private Printer printer;

    public DelegatedPrinterProxy(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(Employee employee) {
        System.out.println("Printing : " + employee);
        try {
            printer.print(employee);
            System.out.println("Printing finished successfully for : " + employee);
        } catch (Exception e) {
            System.out.println("Print problemi : " + e.getMessage());
        }
    }
}
