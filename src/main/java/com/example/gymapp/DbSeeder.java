package com.example.gymapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.gymapp.GymClass;
import com.example.gymapp.GymClassRepository;

@Component
public class DbSeeder implements CommandLineRunner{
	private GymClassRepository gymClassRepository; 
	
	
	public DbSeeder(GymClassRepository gymClassRepository) {
		
		this.gymClassRepository = gymClassRepository;
	}
	@Override
	public void run(String...strings) throws Exception{
		GymClass Zumba = new GymClass(
				"Zumba",
				"run you fatass",
				"30",
				"45",
				20,
				0,
				false
				);
		GymClass Rumba = new GymClass(
				"Rumba",
				"Dance you fatass",
				"35",
				"50",
				20,
				0,
				false
				);
		GymClass Gumba = new GymClass(
				"Gumba",
				"Run faster!",
				"40",
				"60",
				20,
				0,
				false
				);
	
	// drop all GymClasses 	
	this.gymClassRepository.deleteAll();
	
	// add our gymClass to DataBase 
	List<GymClass> gymClasses =Arrays.asList(Zumba,Rumba,Gumba);
	this.gymClassRepository.save(gymClasses);
	}
}

