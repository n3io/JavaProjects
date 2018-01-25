package com.n3io.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n3io.model.Goal;
import com.n3io.repository.GoalRepository;


@Service("goalservice")
public class GoalServiceImpl implements GoalService {

	
	@Autowired
	private GoalRepository goalRepository;
	
	public Goal save(Goal goal) {
		goalRepository.save(goal);
		return goal;
	}

}
