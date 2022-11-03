package org.design.patterns.training.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomerDetails implements Iterable<String> {

    private String name;
    private List<String> numbers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNumber(String num){
        if (numbers == null){
            numbers = new ArrayList<>();
        }
        numbers.add(num);
    }

    public IMyIterator<String> getMyIterator(){
        return new MyIterator();
    }

    public Iterator<String> getNumbersIterator(){
        return numbers.iterator();
    }

    @Override
    public Iterator<String> iterator() {
        return numbers.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        numbers.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return numbers.spliterator();
    }

    public class MyIterator implements IMyIterator<String> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < numbers.size();
        }

        @Override
        public String next() {
            return numbers.get(index++);
        }
    }
}
