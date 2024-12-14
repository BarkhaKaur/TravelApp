package com.project.simplilearn.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="cab_booking_1")
public class CabBooking {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="from_location")
	private String fromLocation;
	
	@Column(name="to_location")
	private String toLocation;
	
	@Column(name="type_of_cab")
	private String typeOfCab;
	
	@ManyToOne(cascade = CascadeType.ALL)	
	@JoinColumn(name="customer_id")
	@JsonBackReference
	private Customer customer; //FK

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public String getTypeOfCab() {
		return typeOfCab;
	}

	public void setTypeOfCab(String typeOfCab) {
		this.typeOfCab = typeOfCab;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CabBooking [id=" + id + ", fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", typeOfCab="
				+ typeOfCab + ", customer=" + "]";
	}
	
	
	
}

