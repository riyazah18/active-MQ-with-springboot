package com.example.activeMQExample.ActiveMQDemo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
	@JmsListener(destination = "myMessage.queue")
    public void receiveQueue(String text) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Message Received: "+text);
    }

}
