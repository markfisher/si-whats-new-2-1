package org.springsource.samples.redis.channel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RedisSub2 {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("redis-sub2.xml", RedisSub2.class);
	}

}
