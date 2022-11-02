package org.design.patterns.training.structural.adapter.chainofresponsibility;

public class CheckNumber implements ICheckNumber {

    private Integer min;
    private Integer max;

    public CheckNumber(Integer min,
                       Integer max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean check(int value) {
        if (min == null) {
            if (max > value) {
                System.out.println(max + " dan küçük");
                return true;
            }
        } else if (max == null) {
            if (value >= min) {
                System.out.println(min + " dan büyük");
                return true;
            }
        } else {
            if (max > value && value >= min) {
                System.out.println(min + " ile " + max + " arasında");
                return true;
            }
        }
        return false;
    }
}
