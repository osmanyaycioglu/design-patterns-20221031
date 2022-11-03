package org.design.patterns.training.behavioral.visitor;

public interface ComputerPartVisitor {
    void visit(Mouse o);
    void visit(Keyboard o);
    void visit(Monitor o);

}
