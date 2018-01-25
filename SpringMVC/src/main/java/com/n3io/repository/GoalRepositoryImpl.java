package com.n3io.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.n3io.model.Goal;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	//@PersistenceContext
//	private EntityManager em;
	
	public Goal save(Goal goal) {
	//	em.persist(goal);
		return goal;
	}

}
