package com.wipro.microservices.i;

// Interface for basic parking functionality
	public interface IParking {
	    void parkCar(Car car);
	    void removeCar(Car car);
	    boolean isCarParked(Car car);
	}

