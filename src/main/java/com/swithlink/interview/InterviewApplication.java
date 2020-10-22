package com.swithlink.interview;

import java.util.ArrayList;
import java.util.Arrays;

import com.swithlink.interview.models.Role;
import com.swithlink.interview.models.User;
import com.swithlink.interview.services.UserService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InterviewApplication {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
	  return new ModelMapper();
	}
  
	// @Override
	// public void run(String... params) {
	//   User admin = new User();
	//   admin.setUsername("admin");
	//   admin.setPassword("admin");
	//   admin.setEmail("admin@email.com");
	//   admin.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_ADMIN)));
  
	//   userService.signup(admin);
  
	//   User client = new User();
	//   client.setUsername("client");
	//   client.setPassword("client");
	//   client.setEmail("client@email.com");
	//   client.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_CLIENT)));
  
	//   userService.signup(client);
	// }

}
