package org.springsource.samples.redis.channel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RedisPub {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("redis-pub.xml", RedisPub.class);
	}

}
