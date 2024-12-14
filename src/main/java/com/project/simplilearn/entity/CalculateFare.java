package com.project.simplilearn.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="calculate_fare_1")
public class CalculateFare {

	@Id
	@GeneratedValue
	@Column(name="fare_id")
	private int fareId;
	
	@Column(name="from_location")
	private String fromLocation;
	
	@Column(name="to_location")
	private String toLocation;
	
	@Column(name="type_of_cab")
	private String typeOfCab;
	
	@Column(name="calculated_fare")
	private BigDecimal calculatedFare;

	public int getFareId() {
		return fareId;
	}

	public void setFareId(int fareId) {
		this.fareId = fareId;
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

	public BigDecimal getCalculatedFare() {
		return calculatedFare;
	}

	public void setCalculatedFare(BigDecimal calculatedFare) {
		this.calculatedFare = calculatedFare;
	}	
	
		
}
