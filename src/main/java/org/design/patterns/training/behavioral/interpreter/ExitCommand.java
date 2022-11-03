package org.design.patterns.training.behavioral.interpreter;

public class ExitCommand implements IInterpret {

    @Override
    public void interpret(String str) {
        System.out.println("Çıkış");
        System.exit(0);
    }

    @Override
    public String command() {
        return "exit";
    }
}
