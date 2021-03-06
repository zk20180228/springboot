package com.honry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Springboot06Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot06Application.class, args);
	}
}
