package com.project.simplilearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.simplilearn.entity.CabBooking;
import com.project.simplilearn.service.CabBookingService;

@RestController
public class CabBookingController {

	@Autowired
	CabBookingService cabBookingService ;
	
	@GetMapping("/cabBookings")
	public List<CabBooking> getAllCabBookings() {
		List<CabBooking> cabBookings = cabBookingService.getAllCabBookings();		
		System.out.println("Inside CabBookingController, size of CabBooking List:" + cabBookings.size());
		return cabBookings;
	}
	
	@PostMapping("/cabBookings") 
	public int saveCabBooking(@RequestBody CabBooking cabBooking) {
		System.out.println(cabBooking.toString());
		cabBookingService.saveCabBooking(cabBooking);
		return cabBooking.getId();
	}	
	
	@DeleteMapping("/cabBookings/{id}")
	public void deleteCabBooking(@PathVariable("id") int id) {
		cabBookingService.deleteCabBooking(id);
	}
	
	@GetMapping("/cabBookings/customer/{name}")
	public List<CabBooking> getCabBookingsByCustomerName(@PathVariable("name") String name){
		return this.cabBookingService.getCabBookingsByCustomerName(name);
	}
	
}
	
