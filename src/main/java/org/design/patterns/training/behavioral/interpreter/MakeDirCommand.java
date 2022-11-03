package org.design.patterns.training.behavioral.interpreter;

public class MakeDirCommand implements IInterpret {
    @Override
    public void interpret(String str) {
        System.out.println("Directory yaratıldı : " + str);
    }

    @Override
    public String command() {
        return "mkdir";
    }
}
