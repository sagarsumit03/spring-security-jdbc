package com.devglan;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.devglan.model.User;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application /* implements CommandLineRunner */ {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

//	@Override
//	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setId(4);
//		user.setPassword(passwordEncoder().encode("password12"));
//		System.out.println(passwordEncoder().encode("password"));
//		user.setUsername("priyanka");
//		// rep.save(user);
//	}

}
