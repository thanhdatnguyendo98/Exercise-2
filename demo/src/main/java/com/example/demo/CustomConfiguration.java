package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * Created by Turreta.com on 8/7/2017.
 */
@Configuration
public class CustomConfiguration {
	@Bean
	@Order(1)
	public StudentBean a() {
		return new StudentBean("dat", 10, 10, 9);
	}

	@Bean
	@Order(2)
	public StudentBean b() {
		return new StudentBean("thien", 4, 5, 6);
	}

	@Bean
	@Order(3)
	public StudentBean c() {
		return new StudentBean("hieu", 7, 8, 9);
	}

	@Bean
	@Order(4)
	public StudentBean d() {
		return new StudentBean("hau", 1, 2, 3);
	}
}