package org.design.patterns.training.behavioral.interpreter;

public class DirCommand implements IInterpret {

    @Override
    public void interpret(String str) {
        System.out.println("Directory listesi : " + str);
    }

    @Override
    public String command() {
        return "dir";
    }
}
