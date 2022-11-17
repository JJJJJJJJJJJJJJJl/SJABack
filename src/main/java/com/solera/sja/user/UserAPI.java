package com.solera.sja.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin(origins="*")
public class UserAPI {
	
	private UserRepository repo;
	
	public UserAPI(UserRepository repo) {
		this.repo = repo;
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return repo.findAll();
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUserById(@PathVariable int id) {
		repo.deleteById(id);
		return;
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User new_user = repo.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(new_user.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
}
