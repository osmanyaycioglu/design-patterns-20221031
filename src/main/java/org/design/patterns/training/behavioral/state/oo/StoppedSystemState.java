package org.design.patterns.training.behavioral.state.oo;

import org.design.patterns.training.behavioral.state.ESystemState;
import org.design.patterns.training.behavioral.state.MyData;

public class StoppedSystemState extends AbstractSystemState{

    public StoppedSystemState(System system) {
        super(system,
              ESystemState.STOPPED);
    }

    @Override
    public void run() {
        getSystem().setCurrent(new RunningSystemState(getSystem()));
    }

    @Override
    public void pause() {
        throw new IllegalStateException("STOP -> PAUSE olmaz");
    }

    @Override
    public void suspend() {
        throw new IllegalStateException("STOP -> SUSPEND olmaz");

    }

    @Override
    public void stop() {

    }

    @Override
    public void write(MyData data) {
        throw new IllegalStateException("Stop state inde yazamazsınız");
    }

}
