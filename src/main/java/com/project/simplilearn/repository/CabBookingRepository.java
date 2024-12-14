package com.project.simplilearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.simplilearn.entity.CabBooking;

@Repository
public interface CabBookingRepository extends CrudRepository<CabBooking, Integer>{
	@Query("select cabBooking from CabBooking cabBooking left join Customer customer on cabBooking.customer.customerId = customer.customerId where customer.customerName = :customerName")
	public List<CabBooking> findCabBookingByCustomerName(@Param("customerName") String customerName);
}
