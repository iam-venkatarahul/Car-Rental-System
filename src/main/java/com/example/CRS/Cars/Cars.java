package com.example.CRS.Cars;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cars {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long CarId;
	public String CarName;
	public String CarNumber;
	public String FuelType;
	
	
	public Cars(long carId, String carName, String carNumber, String fuelType) {
		super();
		CarId = carId;
		CarName = carName;
		CarNumber = carNumber;
		FuelType = fuelType;
	}
	
	public long getCarId() {
		return CarId;
	}
	public void setCarId(long carId) {
		CarId = carId;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public String getCarNumber() {
		return CarNumber;
	}
	public void setCarNumber(String carNumber) {
		CarNumber = carNumber;
	}
	public String getFuelType() {
		return FuelType;
	}
	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}

}
