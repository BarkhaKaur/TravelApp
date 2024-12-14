package com.project.simplilearn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.simplilearn.entity.CalculateFare;

@Repository
public interface CalculateFareRepository extends CrudRepository<CalculateFare, Integer>{
	
}
