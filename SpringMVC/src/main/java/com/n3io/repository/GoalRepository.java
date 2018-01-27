package com.n3io.repository;

import java.util.List;

import com.n3io.model.Goal;
import com.n3io.model.GoalReport;

public interface GoalRepository {

	Goal save(Goal goal);

	List<Goal> loadAll();

	List<GoalReport> findAllGoalReports();
}
