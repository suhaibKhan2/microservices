package com.wipro.microservices.i;
import java.util.ArrayList;
import java.util.List;

	// Class representing a Fee-Based Parking Lot
	public class FeeParking implements IParking, IFeeParking {
	    private List<Car> parkedCars = new ArrayList<>();
	    private double feeRate; // Fee per hour

	    public FeeParking(double feeRate) {
	        this.feeRate = feeRate;
	    }

	    @Override
	    public void parkCar(Car car) {
	        if (!isCarParked(car)) {
	            parkedCars.add(car);
	            System.out.println("Car with license plate " + car.getLicensePlate() + " parked in fee-based parking.");
	        } else {
	            System.out.println("Car with license plate " + car.getLicensePlate() + " is already parked.");
	        }
	    }

	    @Override
	    public void removeCar(Car car) {
	        if (isCarParked(car)) {
	            parkedCars.remove(car);
	            System.out.println("Car with license plate " + car.getLicensePlate() + " removed from fee-based parking.");
	        } else {
	            System.out.println("Car with license plate " + car.getLicensePlate() + " is not parked here.");
	        }
	    }

	    @Override
	    public boolean isCarParked(Car car) {
	        return parkedCars.contains(car);
	    }

	    @Override
	    public double calculateFee(Car car) {
	        // For simplicity, assume the fee is based on a fixed rate
	        return feeRate * 2; // Example: 2 hours
	    }

	    @Override
	    public void payFee(Car car, double amount) {
	        double fee = calculateFee(car);
	        if (amount >= fee) {
	            System.out.println("Fee of $" + fee + " paid for car with license plate " + car.getLicensePlate() + ".");
	        } else {
	            System.out.println("Insufficient payment. Required: $" + fee + ", Provided: $" + amount + ".");
	        }
	    }
	
}
