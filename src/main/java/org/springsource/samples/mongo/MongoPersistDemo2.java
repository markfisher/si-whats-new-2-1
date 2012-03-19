package org.springsource.samples.mongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

public class MongoPersistDemo2 {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("mongo-persist-demo.xml", MongoPersistDemo2.class);
		MessageChannel orders = context.getBean("orders", MessageChannel.class);
		List<Integer> order = new ArrayList<Integer>();
		for (int i = 6; i <= 10; i++) {
			order.add(i);
		}
		orders.send(MessageBuilder.withPayload(order).setHeader("group", "ABC").build());
	}

}
