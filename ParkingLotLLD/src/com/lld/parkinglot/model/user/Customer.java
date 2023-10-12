package com.lld.parkinglot.model.user;

import com.lld.parkinglot.model.parking.ParkingLot;
import com.lld.parkinglot.model.vehicle.Vehicle;

public class Customer {
	
	private String name;
	private Vehicle vehicle;
	private ParkingLot parkingLot;
	
	public Customer(String name, Vehicle vehicle, ParkingLot parkingLot) {
		this.name = name;
		this.vehicle = vehicle;
		this.parkingLot = parkingLot;
	}

	public boolean enterParkingLot() {

		//TODO: check if we can enter the parking lot (is capacity full ?)
		
		
		// if enters, then check if any spot is available on the current floor otherwise move to next floor
		return false;
	}
}
