package org.design.patterns.training.behavioral.state.oo;

import org.design.patterns.training.behavioral.state.MyData;

public class SystemRun {
    public static void main(String[] args) {
        MyData myData = new MyData();
        System system = new System();
        java.lang.System.out.println("System state : " + system.state());
        system.write(myData);
        // boot
        system.run();
        java.lang.System.out.println("System state : " + system.state());
        system.write(myData);
        system.pause();
        java.lang.System.out.println("System state : " + system.state());
        system.write(myData);
        system.run();
        java.lang.System.out.println("System state : " + system.state());
        system.write(myData);
        system.stop();
        java.lang.System.out.println("System state : " + system.state());
        system.write(myData);

    }
}
