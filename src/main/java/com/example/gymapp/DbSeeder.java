package com.example.gymapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.gymapp.GymClass;
import com.example.gymapp.GymClassRepository;
import com.example.gymapp.User;
import com.example.gymapp.UserRepository;

@Component
public class DbSeeder implements CommandLineRunner{
	private GymClassRepository gymClassRepository; 
	private UserRepository userRepository;
	
	public DbSeeder(GymClassRepository gymClassRepository,UserRepository userRepository) {
		
		this.gymClassRepository = gymClassRepository;
		this.userRepository = userRepository;
	}
	@Override
	public void run(String...strings) throws Exception{
		User TalWaiztman = new User(
				"Tal Waizman",
				"tal223@gmail.com",
				"www.dfsdfsd.com"
				);
		User YosiKimhi = new User(
				"Yosi Kimhi",
				"yosilkds@gmail.com",
				"www.daddfsadasd.com"
				);
		User DaniChoen = new User(
				"Dani Choen",
				"dani123@gmail.com",
				"www.dsdsdsd.com"
				);
		GymClass Zumba = new GymClass(
				"Zumba",
				"Pretty much the most awesome workout ever. Dance to great music (latin and international rhythms), with great people, and burn a ton of calories without even realizing it. Join us for this fun, total body workout, combining all elements of fitness – cardio, muscle conditioning, balance and flexibility. Zumba is for everyone, and no, you don’t have to know how to dance!",
				"Monday",
				"18:00",
				"https://www.aclib.us/sites/default/files/zumba_class.jpg",
				30,
				45,
				20,
				0,
				Arrays.asList(DaniChoen),
				false
				);
		GymClass Spinning = new GymClass(
				"Spinning",
				"Climb aboard our specialized bikes and enjoy this unique mind-body experience. Our instructors will lead you through a variety of courses as you “ride with the pack” in this class, limited only by your stamina and imagination. These classes are unlike anything else you’ve experienced before. The bikes are brand new and the music is loud. If you like cardio workouts, you’ll love spinning!",
				"Wednesday",
				"21:00",
				"https://www.gymcompany.es/media/wysiwyg/spinning_5.jpg",
				35,
				50,
				20,
				0,
				Arrays.asList(DaniChoen),
				true
				);
		GymClass Pilates = new GymClass(
				"Pilates",
				"If practiced with consistency, Pilates improves flexibility, builds strength and develops control and endurance in the entire body. It puts emphasis on alignment, breathing, developing a strong core, and improving coordination and balance.",
				"Tuesday",
				"15:00",
				"https://greatist.com/sites/default/files/Pilates_Feature.jpg",
				40,
				60,
				20,
				0,
				Arrays.asList(DaniChoen), 
				false
				);
		GymClass HatahYoga = new GymClass(
				"Hatah Yoga",
				"In this class, postures are practiced to align, strengthen and promote flexibility in the body. Breathing techniques and meditation are also integrated. You can expect an emphasis on simplicity, repetition, and ease of movement. Full-body relaxation and balance are the goals, as we make a full circuit of the body’s range of motion with standing postures, twists, backbends, forward folds, and hip openers.",
				"Wednesday",
				"18:00",
				"https://i.ndtvimg.com/i/2015-06/yoga_625x350_71434091291.jpg",
				40,
				75,
				20,
				0,
				Arrays.asList(DaniChoen), 
				false
				);
	// drop all GymClasses 	
	this.gymClassRepository.deleteAll();
	// drop all users 
	this.userRepository.deleteAll();
	
	// add gymClass to DataBase 
	List<GymClass> gymClasses =Arrays.asList(Zumba,Spinning,Pilates,HatahYoga);
	this.gymClassRepository.save(gymClasses);
	// add users to DataBase 
		List<User> users =Arrays.asList(TalWaiztman,YosiKimhi,DaniChoen);
		this.userRepository.save(users);
	}
}

