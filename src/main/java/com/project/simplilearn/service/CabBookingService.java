package com.project.simplilearn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.simplilearn.entity.CabBooking;
import com.project.simplilearn.entity.Customer;
import com.project.simplilearn.repository.CabBookingRepository;
import com.project.simplilearn.repository.CustomerRepository;

@Service
public class CabBookingService {
	
	@Autowired
	CabBookingRepository cabBookingRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	public List<CabBooking> getAllCabBookings() {
		List<CabBooking> cabBookings = new ArrayList<CabBooking>();
		cabBookingRepository.findAll().forEach(cabBooking -> cabBookings.add(cabBooking));
		System.out.println("Inside CabBookingService, size of CabBooking List:" + cabBookings);
		return cabBookings;
	}

	public void saveCabBooking(CabBooking cabBooking) {
		Optional<Customer> customerOpt = customerRepository.findByCustomerName(cabBooking.getCustomer().getCustomerName());
		if(customerOpt.isPresent()) {
			cabBooking.setCustomer(customerOpt.get());
		}
		cabBookingRepository.save(cabBooking);
	}
	
	public void deleteCabBooking(int id) {
		cabBookingRepository.deleteById(id);
	}
	
	public List<CabBooking> getCabBookingsByCustomerName(String name){
		List<CabBooking> cabBookings = new ArrayList<CabBooking>();
		cabBookingRepository.findCabBookingByCustomerName(name).forEach(cabBooking -> cabBookings.add(cabBooking));
		
//		List<Integer> cabBookingIds = new ArrayList<Integer>();
//		if(cabBookingIds!= null) {
//			cabBookings.forEach(c -> cabBookingIds.add(c.getId()));	
//		}
		return cabBookings;
	}
	
	
}
