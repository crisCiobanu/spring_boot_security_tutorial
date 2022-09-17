package com.ciobanu.security_implementation;

import com.ciobanu.security_implementation.models.Role;
import com.ciobanu.security_implementation.models.User;
import com.ciobanu.security_implementation.services.RoleService;
import com.ciobanu.security_implementation.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

@SpringBootApplication
public class SecurityImplementationApplication {

	public static void main(String[] args) {

		SpringApplication.run(SecurityImplementationApplication.class, args);

	}
	@Bean
	CommandLineRunner run(UserService userService, RoleService roleService){
		return args -> {
			roleService.save(new Role(null, "ROLE_USER"));
			roleService.save(new Role(null, "ROLE_MANAGER"));
			roleService.save(new Role(null, "ROLE_ADMIN"));
			roleService.save(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.save(new User(null, "John", "Travolta", "johm", "1234", new ArrayList<Role>()));
			userService.save(new User(null, "Will", "Smith", "will", "1234", new ArrayList<Role>()));

			userService.addRoleToUser("johm", "ROLE_USER");
			userService.addRoleToUser("will", "ROLE_SUPER_ADMIN");

		};
	}


}
