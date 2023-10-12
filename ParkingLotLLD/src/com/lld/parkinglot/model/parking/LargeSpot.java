package com.lld.parkinglot.model.parking;

import com.lld.parkinglot.enums.ParkingSpotType;

public class LargeSpot extends ParkingSpot {

	public LargeSpot(String spotNumber, boolean isFree) {
		super(spotNumber, isFree, ParkingSpotType.LARGE);
	}
}
