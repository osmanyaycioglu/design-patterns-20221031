package org.design.patterns.training.behavioral.interpreter;

import java.util.Arrays;
import java.util.Scanner;

public class CommandLineRun {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter(Arrays.asList(new DirCommand(),
                                                                new MakeDirCommand(),
                                                                new ExitCommand()));
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String s = scanner.nextLine();
                interpreter.interpret(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
