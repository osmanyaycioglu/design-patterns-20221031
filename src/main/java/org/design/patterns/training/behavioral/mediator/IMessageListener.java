package org.design.patterns.training.behavioral.mediator;

public interface IMessageListener {

    void listen(Message message);

    String uniqueName();

    Integer messageType();
}
