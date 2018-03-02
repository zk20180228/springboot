package com.honry;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class Springboot14ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot14ProducerApplication.class, args);
	}
}
