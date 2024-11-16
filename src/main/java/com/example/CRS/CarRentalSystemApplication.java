package com.example.CRS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example"})
@EnableAutoConfiguration

public class CarRentalSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalSystemApplication.class, args);
	}

}
