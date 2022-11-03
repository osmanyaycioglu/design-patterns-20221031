package org.design.patterns.training.behavioral.state.oo;

import org.design.patterns.training.behavioral.state.ESystemState;
import org.design.patterns.training.behavioral.state.MyData;

public class PausedSystemState extends AbstractSystemState{

    public PausedSystemState(System system) {
        super(system,
              ESystemState.PAUSED);
    }

    @Override
    public void run() {
        getSystem().setCurrent(new RunningSystemState(getSystem()));
    }

    @Override
    public void pause() {
    }

    @Override
    public void suspend() {
        getSystem().setCurrent(new SuspendSystemState(getSystem()));
    }

    @Override
    public void stop() {
        getSystem().setCurrent(new StoppedSystemState(getSystem()));
    }

    @Override
    public void write(MyData data) {
        java.lang.System.out.println("Queue ya yazıyorum");
    }

}
