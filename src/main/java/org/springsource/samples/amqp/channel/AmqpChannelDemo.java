package org.springsource.samples.amqp.channel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmqpChannelDemo {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("amqp-channel.xml", AmqpChannelDemo.class);
	}

}
