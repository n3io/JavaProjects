package com.n3io.service;

import java.util.List;

import com.n3io.model.Goal;
import com.n3io.model.GoalReport;



public interface GoalService {
	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();
}
