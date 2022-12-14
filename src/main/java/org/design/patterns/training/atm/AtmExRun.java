package org.design.patterns.training.atm;

import org.design.patterns.training.behavioral.strategy.atm.AtmCommandAuditObserver;
import org.design.patterns.training.behavioral.strategy.atm.AtmCommandLogObserver;
import org.design.patterns.training.behavioral.strategy.atm.AtmCommandObserverDist;

public class AtmExRun {
    public static void main(String[] args) {
        AtmCommandObserverDist atmCommandObserverDist = new AtmCommandObserverDist();
        atmCommandObserverDist.register(new AtmCommandLogObserver());
        atmCommandObserverDist.register(new AtmCommandAuditObserver());
        AtmController atmController = new AtmController();
        AtmEx atmEx = new AtmEx(atmController,
                                atmCommandObserverDist);

        atmEx.run();
    }
}
