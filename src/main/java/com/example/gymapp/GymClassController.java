package com.example.gymapp;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/gymclasses")
public class GymClassController {
	
	private GymClassRepository gymClassRepository;
	
	public GymClassController(GymClassRepository gymClassRepository) {
		this.gymClassRepository= gymClassRepository;
	}
	
	@GetMapping("/all")
	public List<GymClass> getAll(){
		List<GymClass> gymclasses =  this.gymClassRepository.findAll();
		return gymclasses;
	}
	
	@PutMapping
	public void insert (@RequestBody GymClass gymclass)
	{
		this.gymClassRepository.insert(gymclass);
	}
	
	@PostMapping
	public void update (@RequestBody GymClass gymclass)
	{
		this.gymClassRepository.save(gymclass);
	}
	
	@DeleteMapping("/{id}") 
	public void delete(@PathVariable("id") String id)
	{ 
		this.gymClassRepository.delete(id);
	}
	
	@GetMapping("/{id}") 
	public GymClass getById(@PathVariable("id") String id)
	{
		 GymClass gymClass=this.gymClassRepository.findById(id);
		 return gymClass;
	}
	
	@GetMapping("/price/{maxPrice}")
	public List<GymClass> getByPrice(@PathVariable("maxPrice") int maxPrice )
	
	{	
		List<GymClass> gymClasses = this.gymClassRepository.findBypriceLessThan(maxPrice);
		return gymClasses;
	}
	@GetMapping("/available")
	public List<GymClass> getByClassFullIsFalse(){
		List<GymClass> gymClasses= this.gymClassRepository.findBygymClassFullIsFalse();
		return gymClasses;
	}
	
}
