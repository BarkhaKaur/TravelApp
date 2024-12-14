package com.project.simplilearn.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_1")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="customer_name")
	private String customerName;	
	
	@OneToMany(mappedBy = "customer" , cascade=CascadeType.ALL) //
	@JsonManagedReference
	private List<CabBooking> cabBookings;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<CabBooking> getCabBookings() {
		return cabBookings;
	}

	public void setCabBookings(List<CabBooking> cabBookings) {
		this.cabBookings = cabBookings;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", cabBookings=" + cabBookings
				+ "]";
	}
	
}
