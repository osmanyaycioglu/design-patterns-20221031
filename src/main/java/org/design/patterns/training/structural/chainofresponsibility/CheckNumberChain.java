package org.design.patterns.training.structural.chainofresponsibility;

public class CheckNumberChain implements ICheckNumber {

    private Integer          min;
    private Integer          max;
    private CheckNumberChain numberChain;

    public CheckNumberChain(CheckNumberChain numberChain,
                            Integer min,
                            Integer max) {
        this.numberChain = numberChain;
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
        if (numberChain != null){
            return numberChain.check(value);
        }
        return false;
    }
}
