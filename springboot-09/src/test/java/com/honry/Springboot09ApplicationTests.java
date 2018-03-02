package com.honry;

import com.honry.bean.User;
import com.honry.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot09ApplicationTests {

	@Autowired
	private UserDao userDao;


	@Before
	public void contextLoads() {
		System.out.println(userDao);
	}

	@Test
	public void testAdd(){
		User user=new User();
		user.setUserName("test");
		user.setPassword("root");
		user.setPhone("13333xxx");
		user.setEmail("111xx@qq.com");
		user.setCreated(new Date());
		user.setUpdated(new Date());
		userDao.addUser(user);
		testQueryLastId();

	}

	@Test
	public void testDel(){
		userDao.delUserById(43);

	}

	@Test
	public void testUpdate(){

		User user= new User();
		user.setId(37);
		user.setUserName("honry");
		user.setUpdated(new Date());
		userDao.updateUserByid(user);
	}

	@Test
	public void testQuery(){

		List<User> users = userDao.findAllUsers();
		for (User user : users) {
			System.out.println(user);
		}
	}


	@Test
	public void testQueryLastId(){
		Long id = userDao.getLastId();
		System.out.println(id);

	}



}
