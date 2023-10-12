package com.lld.parkinglot.model.parking;

import com.lld.parkinglot.enums.ParkingSpotType;

public class CompactSpot extends ParkingSpot {

	public CompactSpot(String spotNumber, boolean isFree) {
		super(spotNumber, isFree, ParkingSpotType.COMPACT);
	}
}
