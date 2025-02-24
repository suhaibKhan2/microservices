package com.wipro.microservices.i;

	// Main class to demonstrate the usage
	public class ParkingExample {
	    public static void main(String[] args) {
	        // Create cars
	        Car car1 = new Car("ABC123");
	        Car car2 = new Car("XYZ789");

	        // Create a basic parking lot
	        ParkingLot parkingLot = new ParkingLot();
	        parkingLot.parkCar(car1);
	        parkingLot.removeCar(car1);

	        // Create a fee-based parking lot
	        FeeParking feeParking = new FeeParking(5.0); // $5 per hour
	        feeParking.parkCar(car2);
	        double fee = feeParking.calculateFee(car2);
	        feeParking.payFee(car2, 10.0); // Pay $10 for the fee
	        feeParking.removeCar(car2);
	    
	}
}
