package org.design.patterns.training.behavioral.mediator;

import java.util.Arrays;

public class MediatorRun {
    public static void main(String[] args) {
        Mediator messageDistributor = new Mediator(Arrays.asList(new MessageListener("client1",1),
                                                                 new MessageListener("client2",1),
                                                                 new MessageListener("client3",2),
                                                                 new MessageListener("client4",3),
                                                                 new MessageListener("client5",3)
        ));
        Message message = new Message();
        message.setMsgType(1);
        message.setMsgText("message 1");
        messageDistributor.sendMessage(message);

        Message message2 = new Message();
        message2.setMsgType(1);
        message2.setMsgText("message 2");
        messageDistributor.sendMessage(message2,"client3");

        messageDistributor.register(new MessageListener("client6"));
        System.out.println("-------------------- ");
        messageDistributor.sendMessage(message);
        System.out.println("----------3---------- ");
        message = new Message();
        message.setMsgType(3);
        message.setMsgText("message 3");
        messageDistributor.sendMessageByType(message);

    }
}
