package com.lld.parkinglot.model.parking;

import java.util.Date;

import com.lld.parkinglot.model.vehicle.Vehicle;

public class ParkingEntry {

	private int id;
	private ParkingFloor parkingFloor;
	private DisplayBoard displayBoard; 
	private ParkingLot parkingLot;

	public ParkingEntry(int id, ParkingFloor parkingFloor) {
		this.id = id;
		this.parkingFloor = parkingFloor;
		this.parkingLot = ParkingLot.getInstance();
	}
	
	public void issueParkingTicket(Vehicle vehicle) {
		
		if (parkingLot.isParkingFull()) {
			displayBoard.displayParkingIsFull();
		}
		else {
			
			// Generate parking ticket and assign it to the vehicle.
			ParkingTicket parkingTicket = parkingLot.generateParkingTicket(vehicle);
			
		}
		
	}
	
	
}
