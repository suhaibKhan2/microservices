package com.wipro.microservices.i;

	// Interface for fee-based parking functionality
	public interface IFeeParking {
	    double calculateFee(Car car);
	    void payFee(Car car, double amount);
	}

