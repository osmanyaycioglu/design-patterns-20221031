package org.design.patterns.training.behavioral.state;

public class System {
    private ESystemState state = ESystemState.BOOTING;


    public void run() {
        state = ESystemState.RUNNING;
    }

    public void suspend() {
        state = ESystemState.SUSPEND;
    }

    public void pause() {
        state = ESystemState.PAUSED;
    }

    public void stopped() {
        if (state == ESystemState.PAUSED){
            throw new IllegalStateException("PAUSED dan STOPPED a geçilemez");
        }
        state = ESystemState.STOPPED;
    }


    public ESystemState getState() {
        return state;
    }

    public void setState(ESystemState state) {
        this.state = state;
    }
}
