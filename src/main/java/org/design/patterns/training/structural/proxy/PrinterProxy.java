package org.design.patterns.training.structural.proxy;

import org.design.patterns.training.creational.builder.adapter.Employee;
import org.design.patterns.training.creational.builder.adapter.Printer;

public class PrinterProxy extends Printer {

    @Override
    public void print(Employee employee) {
        System.out.println("Printing : " + employee);
        try {
            super.print(employee);
            System.out.println("Printing finished successfully for : " + employee);
        } catch (Exception e) {
            System.out.println("Print problemi : " + e.getMessage());
        }
    }
}
