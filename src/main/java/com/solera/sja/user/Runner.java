package com.solera.sja.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// [2, 3, 0]

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private UserRepository user_repo;

	@Override
	public void run(String... args) throws Exception {
		User admin = new User(1, "admin", "admin", "777777777", "admin@gmail.com");
		user_repo.save(admin);
	}
}
