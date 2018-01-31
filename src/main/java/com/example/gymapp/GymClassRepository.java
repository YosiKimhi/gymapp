package com.example.gymapp;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymClassRepository extends MongoRepository<GymClass, String> {
	
	GymClass findById(String id);
	List<GymClass> findBypriceLessThan(int MaxPrice);
	List<GymClass> findBygymClassFullIsFalse();
}

