package com.example.activeMQExample.ActiveMQDemo;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageCreator implements CommandLineRunner{

	 @Autowired
	    private JmsMessagingTemplate jmsMessagingTemplate;
	 
	    @Autowired
	    private Queue queue;
	    
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.jmsMessagingTemplate.convertAndSend(this.queue, "Hello World!!");
        System.out.println("Message has been put to queue by sender");
		
	}

}
