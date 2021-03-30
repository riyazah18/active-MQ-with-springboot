package com.example.activeMQExample.ActiveMQDemo;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
 

@SpringBootApplication
@EnableJms
public class ActiveMqDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveMqDemoApplication.class, args);		
		
		/*
		 * ApplicationContext ctx = SpringApplication.run(ActiveMqDemoApplication.class,
		 * args);
		 * 
		 * JmsTemplate jms = ctx.getBean(JmsTemplate.class);
		 * jms.convertAndSend("My Meesage", "test message");
		 */
	}
	
	@Bean
    public Queue queue() {
        return new ActiveMQQueue("myMessage.queue");
    }

}
