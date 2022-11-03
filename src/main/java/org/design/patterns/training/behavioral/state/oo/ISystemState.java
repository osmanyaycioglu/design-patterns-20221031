package org.design.patterns.training.behavioral.state.oo;

import org.design.patterns.training.atm.EAccountType;
import org.design.patterns.training.behavioral.state.ESystemState;

public interface ISystemState extends ISystemTasks {

    void run();

    void pause();

    void suspend();

    void stop();

    ESystemState state();

}
