package com.example.CRS.Cars;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService{
	
	CarRepository carrepo_obj;

	@Override
	public List<Cars> findAllCars() {
		return carrepo_obj.findAll();
	}

}
