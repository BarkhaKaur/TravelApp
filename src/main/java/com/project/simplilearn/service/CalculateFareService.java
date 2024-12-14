package com.project.simplilearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.simplilearn.entity.CalculateFare;
import com.project.simplilearn.repository.CalculateFareRepository;

@Service
public class CalculateFareService {

	@Autowired
	CalculateFareRepository calculateFareRepository;
	
	public List<CalculateFare> getAllCalculateFare() {
		List<CalculateFare> calculateFares = new ArrayList<CalculateFare>();
		calculateFareRepository.findAll().forEach(calculateFare -> calculateFares.add(calculateFare));
		System.out.println("Inside getAllCalculateFare, :"  );
		return calculateFares;
	}
	

}
