package com.example.gymapp;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/users")
@CrossOrigin("*")
public class UserController {
	
	private UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	@GetMapping("/all")
	public List<User> getAll(){
		List <User> users =  this.userRepository.findAll();
		return users;
	}
	
	@PutMapping
	public void insert (@RequestBody User user)
	{
		this.userRepository.insert(user);
	}
	@PostMapping
	public void update (@RequestBody User user)
	{
		this.userRepository.save(user);
	}
	
	@DeleteMapping("/{id}") 
	public void delete(@PathVariable("id") String id)
	{ 
		this.userRepository.delete(id);
	}
	@GetMapping("/{id}") 
	public User getById(@PathVariable("id") String id)
	{
		 User user=this.userRepository.findById(id);
		 return user;
	}
	
}


