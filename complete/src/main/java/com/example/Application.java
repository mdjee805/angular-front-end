package com.example;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
/*import org.springframework.core.io.ClassPathResource;

import com.example.repository.CityRepository;

import java.io.File;
import java.io.IOException;*/

@SpringBootApplication(exclude = {
	org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
	org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
	)
//@EntityScan("com.example.model")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*@Bean
  	ApplicationRunner init(CityRepository cr) {
		try {
			File f = new ClassPathResource("data.sql").getFile();
			Stream.of(f).forEach(sql -> {

			})
		}
		catch(IOException e) {
			System.out.println("error opening data.sql: " + e.getMessage());
		}
		finally {
			return args;
		}
	}*/

	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}*/

}
