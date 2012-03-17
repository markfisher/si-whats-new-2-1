package org.springsource.samples.redis.channel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RedisSub1 {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("redis-sub1.xml", RedisSub1.class);
	}

}
