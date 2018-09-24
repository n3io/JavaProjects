package com.n3io.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.n3io.model.Exercise;
import com.n3io.model.Goal;

@Repository("exerciseRepository")
@Transactional
public class ExerciseRepositoryImpl implements ExerciseRepository{

	
	@Autowired
	SessionFactory session;
	
	public Exercise save(Exercise exercise) {
		session.getCurrentSession().saveOrUpdate(exercise);
		return exercise;
	}

}
