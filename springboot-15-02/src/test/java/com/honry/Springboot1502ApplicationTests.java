package com.honry;

import com.honry.rest.client.RestCilentController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot1502ApplicationTests {

	@Resource
	private RestCilentController restCilentController;

	@Test
	public void contextLoads() {
	}


	@Test
	public void findAllUsers(){
		restCilentController.findAllUsers();
	}


	@Test
	public void findUser(){
		restCilentController.findUserByAge();
	}

}
