package com.n3io.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n3io.model.Activity;
import com.n3io.model.Exercise;
import com.n3io.repository.ExerciseRepository;
import com.n3io.repository.UserRepository;


@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {


	@Autowired
	private ExerciseRepository exerciseRepository;
	
	
	public List<Activity> findAllActivities() {
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}
	
	public Exercise save(Exercise exercise) {
		return exerciseRepository.save(exercise);
		
	}
}
