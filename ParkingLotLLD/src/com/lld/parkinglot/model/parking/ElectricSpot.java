package com.lld.parkinglot.model.parking;

import com.lld.parkinglot.enums.ParkingSpotType;

public class ElectricSpot extends ParkingSpot {

	public ElectricSpot(String spotNumber, boolean isFree) {
		super(spotNumber, isFree, ParkingSpotType.ELECTRIC);
	}
}
