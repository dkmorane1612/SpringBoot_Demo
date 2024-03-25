package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Person;

@SpringBootApplication
public class SpringBootIntroApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
		SpringApplication.run(SpringBootIntroApplication.class, args);
		
		Person pers = context.getBean(Person.class, 42 , "Swapnil" , "Nashik");
		System.out.println(pers);
	}

}
