package org.design.patterns.training.behavioral.state.oo;

import org.design.patterns.training.behavioral.state.ESystemState;

public abstract class AbstractSystemState implements ISystemState {

    private System system;
    private ESystemState systemState;

    public AbstractSystemState(System system,
                               ESystemState systemState) {
        this.system = system;
        this.systemState = systemState;
    }

    @Override
    public ESystemState state() {
        return systemState;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }
}
