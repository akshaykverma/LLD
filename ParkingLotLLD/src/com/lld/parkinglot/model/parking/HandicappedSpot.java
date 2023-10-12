package com.lld.parkinglot.model.parking;

import com.lld.parkinglot.enums.ParkingSpotType;

public class HandicappedSpot extends ParkingSpot {

	public HandicappedSpot(String spotNumber, boolean isFree) {
		super(spotNumber, isFree, ParkingSpotType.HANDICAPPED);
	}
}
