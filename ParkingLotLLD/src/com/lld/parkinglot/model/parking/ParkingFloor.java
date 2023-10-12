package com.lld.parkinglot.model.parking;

import java.util.Map;

public class ParkingFloor {
	
	private String floorNumber;
	private Map<String, ParkingSpot> parkingSpots;
	private DisplayBoard displayBoard;
	
	public ParkingFloor(String floorNumber, Map<String, ParkingSpot> parkingSpots,
			DisplayBoard displayBoard) {
		this.floorNumber = floorNumber;
		this.parkingSpots = parkingSpots;
		this.displayBoard = displayBoard;
	}

}
