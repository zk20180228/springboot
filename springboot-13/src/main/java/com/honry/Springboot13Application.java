package com.honry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching//开启缓存功能
@SpringBootApplication
public class Springboot13Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot13Application.class, args);
	}
}
