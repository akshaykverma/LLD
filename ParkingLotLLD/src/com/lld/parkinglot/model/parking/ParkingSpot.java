package com.lld.parkinglot.model.parking;

import com.lld.parkinglot.enums.ParkingSpotType;
import com.lld.parkinglot.model.vehicle.Vehicle;

public class ParkingSpot {
	
	private String spotNumber;
	private boolean isFree;
	private ParkingSpotType spotType;
	private Vehicle vehicle;
	
	public ParkingSpot(String spotNumber, boolean isFree, ParkingSpotType spotType) {
		this.spotNumber = spotNumber;
		this.isFree = isFree;
		this.spotType = spotType;
	}
	
	public void assignVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public String getSpotNumber() {
		return spotNumber;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public ParkingSpotType getSpotType() {
		return spotType;
	}

	public void setSpotType(ParkingSpotType spotType) {
		this.spotType = spotType;
	}

}
