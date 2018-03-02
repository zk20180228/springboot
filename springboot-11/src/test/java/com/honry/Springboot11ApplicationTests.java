package com.honry;

import com.honry.redis.RedisTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot11ApplicationTests {

	@Resource
	private RedisTest redisTest;

	@Before
	public void contextLoads() {

		System.out.println(redisTest);
	}

	@Test
	public void testSet(){

		redisTest.set("hell_springboot","stringboot");

	}

	@Test
	public void testGet(){

		String str = redisTest.get("hell_springboot");
		System.out.println(str);
	}

	@Test
	public void del(){

		redisTest.del("hell_springboot");
	}



}
