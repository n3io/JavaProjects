package com.n3io.service;

import java.util.List;

import com.n3io.model.Activity;
import com.n3io.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}