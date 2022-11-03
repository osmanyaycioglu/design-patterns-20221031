package org.design.patterns.training.behavioral.state.oo;

import org.design.patterns.training.behavioral.state.ESystemState;
import org.design.patterns.training.behavioral.state.MyData;

public class SuspendSystemState extends AbstractSystemState{

    public SuspendSystemState(System system) {
        super(system,
              ESystemState.SUSPEND);
    }

    @Override
    public void run() {
        getSystem().setCurrent(new RunningSystemState(getSystem()));
    }

    @Override
    public void pause() {
        getSystem().setCurrent(new PausedSystemState(getSystem()));
    }

    @Override
    public void suspend() {

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
