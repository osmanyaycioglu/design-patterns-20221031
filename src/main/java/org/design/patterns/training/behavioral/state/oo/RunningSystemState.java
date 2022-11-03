package org.design.patterns.training.behavioral.state.oo;

import org.design.patterns.training.behavioral.state.ESystemState;
import org.design.patterns.training.behavioral.state.MyData;

public class RunningSystemState extends AbstractSystemState{

    public RunningSystemState(System system) {
        super(system,
              ESystemState.RUNNING);
    }

    @Override
    public void run() {

    }

    @Override
    public void pause() {
        getSystem().setCurrent(new PausedSystemState(getSystem()));
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
        java.lang.System.out.println("Db ye yazıyorum");
    }

}
