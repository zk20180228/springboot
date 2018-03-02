package com.honry;

import com.honry.bean.TbUser;
import com.honry.mapper.TbUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot18DruidApplicationTests {

	@Resource
	private TbUserMapper tbUserMapper;


	@Test
	public void contextLoads() {
	}

	@Test
	public void testFindById(){
		TbUser tbUser = tbUserMapper.findById(37);
		System.out.println(tbUser);
	}
}
