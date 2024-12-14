package com.project.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.simplilearn.entity.CabBooking;
import com.project.simplilearn.entity.CalculateFare;
import com.project.simplilearn.service.CalculateFareService;


@RestController
public class CalculateFareController {

	@Autowired
	CalculateFareService calculateFareService ;
	
	@GetMapping("/calculateFares")
	public List<CalculateFare> getAllCalculateFares() {
		List<CalculateFare> calculateFares = calculateFareService.getAllCalculateFare();		
		System.out.println("Inside CalculateFareController, size of CalculateFare List:" + calculateFares.size());
		return calculateFares;
	}
	
}
