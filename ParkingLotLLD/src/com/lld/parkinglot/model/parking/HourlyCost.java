package com.lld.parkinglot.model.parking;

import java.util.HashMap;
import java.util.Map;

import com.lld.parkinglot.enums.ParkingSpotType;

public class HourlyCost {
	
	private Map<ParkingSpotType, Double> costMap;

	public HourlyCost() {
		
		costMap = new HashMap<>();
		costMap.put(ParkingSpotType.COMPACT, 20.0);
		costMap.put(ParkingSpotType.LARGE, 30.0);
		costMap.put(ParkingSpotType.HANDICAPPED, 10.0);
		costMap.put(ParkingSpotType.ELECTRIC, 30.0);
		costMap.put(ParkingSpotType.MOTORCYCLE, 10.0);
	}
	
	public double getHourlyCost(ParkingSpotType parkingSpotType) {
		return costMap.get(parkingSpotType);
	}
}
