package com.example.demo.TestConfig;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.entity.User;
import com.example.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u = new User.UserBuilder().id(null).name("Joao").lastName("Silva").email("joao@unifor.br").password("12345j3i").createUser();
		User x = new User.UserBuilder().id(null).name("Maria").lastName("Ferreira").email("maria@unifor.br").password("1hh2ys567").createUser();
		
		userRepository.saveAll(Arrays.asList(u,x));
		
	}

	
}
