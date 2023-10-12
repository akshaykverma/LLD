package com.lld.parkinglot.model.parking;

import com.lld.parkinglot.enums.ParkingSpotType;

public class MotorcycleSpot extends ParkingSpot {

	public MotorcycleSpot(String spotNumber, boolean isFree) {
		super(spotNumber, isFree, ParkingSpotType.MOTORCYCLE);
	}

	
}
