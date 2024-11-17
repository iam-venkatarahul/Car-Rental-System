package com.example.CRS.Cars;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService{
	
	private Long nextId = 1L;
	
	CarRepository carrepo_obj;
	

	public CarServiceImpl(CarRepository carrepo_obj) {
		super();
		this.carrepo_obj = carrepo_obj;
	}

	@Override
	public List<Cars> findAllCars() {
		return carrepo_obj.findAll();
	}

	@Override
	public void CreateCar(Cars car) {
		car.setCarId(nextId++);
		carrepo_obj.save(car);
		
	}

}
