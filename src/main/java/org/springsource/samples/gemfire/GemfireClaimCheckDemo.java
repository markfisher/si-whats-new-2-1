package org.springsource.samples.gemfire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.core.MessagingTemplate;

public class GemfireClaimCheckDemo {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("gemfire-claimcheck.xml", GemfireClaimCheckDemo.class);
		MessageChannel channel = context.getBean("checkin", MessageChannel.class);
		MessagingTemplate template = new MessagingTemplate(channel);
		for (int i = 1; i <= 10; i++) {
			template.convertAndSend("This is message payload #" + i);
		}
	}

}
