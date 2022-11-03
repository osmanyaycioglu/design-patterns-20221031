package org.design.patterns.training.behavioral.mediator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Mediator {
    private Map<String, IMessageListener> messageListenerMap = new HashMap<>();
    private Map<Integer, MessageListenerContainer> byMessageTypemessageListenerMap = new HashMap<>();

    public Mediator(List<IMessageListener> messageListeners) {
        messageListeners.forEach(i -> { messageListenerMap.put(i.uniqueName(),
                                                             i);
            if (i.messageType() != null){
                MessageListenerContainer messageListenerContainer = byMessageTypemessageListenerMap.get(i.messageType());
                if (messageListenerContainer == null){
                    messageListenerContainer = new MessageListenerContainer();
                    byMessageTypemessageListenerMap.put(i.messageType(),messageListenerContainer);
                }
                messageListenerContainer.addListener(i);
            }
        });
    }

    public void register(IMessageListener messageListener){
        messageListenerMap.put(messageListener.uniqueName(),messageListener);
        MessageListenerContainer messageListenerContainer = byMessageTypemessageListenerMap.get(messageListener.messageType());
        if (messageListenerContainer == null){
            messageListenerContainer = new MessageListenerContainer();
            byMessageTypemessageListenerMap.put(messageListener.messageType(),messageListenerContainer);
        }
        messageListenerContainer.addListener(messageListener);
    }

    public void sendMessage(Message message) {
        messageListenerMap.values()
                          .forEach(i -> i.listen(message));
    }

    public void sendMessage(Message message,
                            String dest) {
        Optional.of(messageListenerMap.get(dest))
                .ifPresent(i -> i.listen(message));
    }

    public void sendMessageByType(Message message){
        MessageListenerContainer messageListenerContainer = byMessageTypemessageListenerMap.get(message.getMsgType());
        if (messageListenerContainer != null){
            messageListenerContainer.sendMesaage(message);
        }
    }
}
