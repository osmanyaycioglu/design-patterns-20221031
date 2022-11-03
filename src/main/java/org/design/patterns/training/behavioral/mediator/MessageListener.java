package org.design.patterns.training.behavioral.mediator;

public class MessageListener implements IMessageListener{
    private String name;
    private Integer messageType;

    public MessageListener(String name) {
        this.name = name;
    }

    public MessageListener(String name,
                           Integer messageType) {
        this.name = name;
        this.messageType = messageType;
    }

    @Override
    public void listen(Message message) {
        System.out.println("Client : " + name  + " received : " + message);
    }

    @Override
    public String uniqueName() {
        return name;
    }

    @Override
    public Integer messageType() {
        return messageType;
    }
}
