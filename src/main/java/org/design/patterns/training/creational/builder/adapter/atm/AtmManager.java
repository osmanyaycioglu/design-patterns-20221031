package org.design.patterns.training.creational.builder.adapter.atm;

import org.design.patterns.training.creational.builder.adapter.Employee;
import org.design.patterns.training.creational.builder.adapter.Printer;
import org.design.patterns.training.creational.singleton.MyLazySingleton;


public class AtmManager {

    private static volatile AtmManager instance;
    private Printer printer = new Printer();


    private AtmManager() {
    }

    public static AtmManager getInstance() {
        if (instance == null) {
            synchronized (MyLazySingleton.class) {
                if (instance == null) {
                    instance = new AtmManager();
                }
            }
        }
        return instance;
    }

    public void print(Employee employee){
        printer.print(employee);
    }

}
