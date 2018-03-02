package com.honry;

import com.honry.amqp.producer.AmqpProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot14ProducerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Resource
	private AmqpProducer amqpProducer;

	@Test
	public void testAmqp(){
		amqpProducer.sendMsg();
	}

}
