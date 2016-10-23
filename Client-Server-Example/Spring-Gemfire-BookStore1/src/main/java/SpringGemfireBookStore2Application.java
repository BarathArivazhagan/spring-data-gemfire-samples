package com.barath.bookstore.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@SpringBootApplication
//@EnableGemfireRepositories
//@ImportResource("classpath:client-cache.xml")
public class SpringGemfireBookStore1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringGemfireBookStore1Application.class, args);
	}
}