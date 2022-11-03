package org.design.patterns.training.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class MessageListenerContainer {
    private List<IMessageListener> messageListeners = new ArrayList<>();

    public void addListener(IMessageListener listener){
        messageListeners.add(listener);
    }

    public void sendMesaage(Message message){
        messageListeners.forEach(i -> i.listen(message));
    }

}
