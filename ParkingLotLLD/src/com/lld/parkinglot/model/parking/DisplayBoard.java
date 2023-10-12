package com.lld.parkinglot.model.parking;

import java.util.Map;

public class DisplayBoard {
	
	private String message;
	private Map<ParkingSpot, Integer> freeSpots;
	
	public DisplayBoard() {
		
	}
	
	

	public void displayFreeParkingSpots(Map<ParkingSpot, Integer> freeSpots) {
		
		// iterate over the map and display free parking spot for each spot type
		freeSpots.forEach((spot, count) -> {
			System.out.println(" No. of free " + spot.getSpotType() + " spots : " + count);
		});
	}
	
	public void displayParkingIsFull() {
		System.out.println("*** Parking is full ***");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
