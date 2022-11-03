package org.design.patterns.training.behavioral.state;

public class WriteData {
    private System system;

    public WriteData(System system) {
        this.system = system;
    }

    public void write(MyData data) {
        if (system.getState() == ESystemState.BOOTING) {
            // cache
        } else if (system.getState() == ESystemState.RUNNING){
            // db
        } else if (system.getState() == ESystemState.PAUSED){
            // dış queue
        }
    }

}
