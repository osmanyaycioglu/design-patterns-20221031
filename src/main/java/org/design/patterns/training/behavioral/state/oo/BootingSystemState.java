package org.design.patterns.training.behavioral.state.oo;

import org.design.patterns.training.behavioral.state.ESystemState;
import org.design.patterns.training.behavioral.state.MyData;

public class BootingSystemState extends AbstractSystemState {

    public BootingSystemState(System system) {
        super(system,
              ESystemState.BOOTING);
    }

    @Override
    public void run() {
        getSystem().setCurrent(new RunningSystemState(getSystem()));
    }

    @Override
    public void pause() {
        throw new IllegalStateException("PAUSE geçemezsin");
    }

    @Override
    public void suspend() {
        throw new IllegalStateException("SUSPEND geçemezsin");
    }

    @Override
    public void stop() {
        throw new IllegalStateException("STOPPED geçemezsin");

    }

    @Override
    public void write(MyData data) {
        java.lang.System.out.println("Cache e yazıyorum");
        // cache
    }
}
