package com.n3io.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n3io.model.Goal;
import com.n3io.model.GoalReport;
import com.n3io.repository.GoalRepository;


@Service("goalservice")
public class GoalServiceImpl implements GoalService {

	
	@Autowired
	private GoalRepository goalRepository;
	
	public Goal save(Goal goal) {
		goalRepository.save(goal);
		return goal;
	}

	public List<Goal> findAllGoals(){
		return goalRepository.loadAll();
	}

	public List<GoalReport> findAllGoalReports() {
		return goalRepository.findAllGoalReports();
	}
}
