package com.honry;

import com.honry.nosql.MongoDBTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot12ApplicationTests {

	@Resource
	private MongoDBTest mongoDBTest;
	@Before
	public void contextLoads() {
		System.out.println(mongoDBTest);
	}

	@Test
	public void testAdd(){
		mongoDBTest.addDocuments();
	}

	@Test
	public void testDel(){
		mongoDBTest.delDocument();
	}

	@Test
	public void testUpdate(){
		mongoDBTest.updateDocument();
	}

	@Test
	public void testFind(){
		mongoDBTest.findDocument01();
	}



}
