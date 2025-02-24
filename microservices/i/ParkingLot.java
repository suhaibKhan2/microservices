package com.wipro.microservices.i;

import java.util.ArrayList;
import java.util.List;

	// Class representing a basic Parking Lot
	public class ParkingLot implements IParking {
	    private List<Car> parkedCars = new ArrayList<>();

	    @Override
	    public void parkCar(Car car) {
	        if (!isCarParked(car)) {
	            parkedCars.add(car);
	            System.out.println("Car with license plate " + car.getLicensePlate() + " parked.");
	        } else {
	            System.out.println("Car with license plate " + car.getLicensePlate() + " is already parked.");
	        }
	    }

	    @Override
	    public void removeCar(Car car) {
	        if (isCarParked(car)) {
	            parkedCars.remove(car);
	            System.out.println("Car with license plate " + car.getLicensePlate() + " removed.");
	        } else {
	            System.out.println("Car with license plate " + car.getLicensePlate() + " is not parked here.");
	        }
	    }

	    @Override
	    public boolean isCarParked(Car car) {
	        return parkedCars.contains(car);
	    }
	
}
