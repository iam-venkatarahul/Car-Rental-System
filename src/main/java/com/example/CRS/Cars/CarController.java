package com.example.CRS.Cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

	@Autowired
	CarService carservice_obj;
	
  public CarController(CarService carservice_obj) {
		super();
		this.carservice_obj = carservice_obj;
	}

@GetMapping("/cars")
  public ResponseEntity<List<Cars>> findAllCars() {
	  return ResponseEntity.ok(carservice_obj.findAllCars());
  }
}
