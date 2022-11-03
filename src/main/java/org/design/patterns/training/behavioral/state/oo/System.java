package org.design.patterns.training.behavioral.state.oo;

import org.design.patterns.training.behavioral.state.ESystemState;
import org.design.patterns.training.behavioral.state.MyData;

public class System implements ISystemState {
    private ISystemState current = new BootingSystemState(this);

    @Override
    public void run() {
        current.run();
    }

    @Override
    public void pause() {
        current.pause();
    }

    @Override
    public void suspend() {
        current.suspend();
    }

    @Override
    public void stop() {
        current.stop();
    }

    @Override
    public ESystemState state() {
        return current.state();
    }

    public ISystemState getCurrent() {
        return current;
    }

    public void setCurrent(ISystemState current) {
        this.current = current;
    }

    @Override
    public void write(MyData data) {
        current.write(data);
    }
}
