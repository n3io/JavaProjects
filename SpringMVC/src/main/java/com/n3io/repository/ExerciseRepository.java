package com.n3io.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.n3io.model.Exercise;


public interface ExerciseRepository {

	Exercise save(Exercise exercise);

	
}
