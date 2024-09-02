package com.CompleteSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.OutOffCourse.Details;

@SpringBootApplication
@ComponentScan("com")
public class CompleteSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompleteSpringApplication.class, args);
	}
	@Primary
	@Bean
	@Scope("prototype")//"singleton"
	public Details d() {
		Details d1=new Details();
		return d1;
	}
     
	
}
