package org.design.patterns.training.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorRun {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("osman",
                                             "ali",
                                             "veli");
        for (String str : strings) {
            System.out.println(str);
        }
        strings.forEach(s -> System.out.println(s));

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setName("osman");
        customerDetails.addNumber("3892233");
        customerDetails.addNumber("3892234");
        customerDetails.addNumber("3892235");

        IMyIterator<String> myIterator = customerDetails.getMyIterator();
        while (myIterator.hasNext()) {
            String next = myIterator.next();
            System.out.println(next);
        }

        for (String str :
                customerDetails) {
            System.out.println(str);
        }
    }

}
