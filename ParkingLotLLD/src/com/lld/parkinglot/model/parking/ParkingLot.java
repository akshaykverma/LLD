package com.lld.parkinglot.model.parking;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.lld.parkinglot.enums.ParkingSpotType;
import com.lld.parkinglot.model.vehicle.Vehicle;

public class ParkingLot {
	
	private String name;
	private String address;
	
	private Map<String, ParkingFloor> parkingFloors;
	private Map<String, ParkingEntry> parkingEntry;
	private Map<String, ParkingExit> parkingExit;
	
	private Map<ParkingSpotType, Integer> parkingSpots;
	
	private static ParkingLot parkingLot; 	
	
	private ParkingLot() {
		
		// initialize parking spots map
		initializeParkingSpotsMap();
		
		// initialize floors		
		initializeFloors();
		
	}
	
	private void initializeFloors() {
		
		Map<String, ParkingSpot> spots = new HashMap<>();
		
		parkingFloors = new HashMap<>();
		ParkingFloor floor;
		ParkingSpot spot;
		
		spots.put("S1", new CompactSpot("S1", true));
		spots.put("S2", new CompactSpot("S2", false));
		spots.put("S3", new LargeSpot("S3", true));
		spots.put("S4", new LargeSpot("S4", false));
		spots.put("S5", new ElectricSpot("S5", true));
		spots.put("S6", new ElectricSpot("S6", false));
		
		
		
		// updating spot count based on the spot type
		//updateSpotCount(spot);
		
		//parkingFloor = new ParkingFloor("F1", spots, null);
		
	}

	private void updateSpotCount(ParkingSpot spot) {
		parkingSpots.put(spot.getSpotType(), parkingSpots.get(spot.getSpotType()) + 1);
	}

	private void initializeParkingSpotsMap() {
		parkingSpots = new HashMap<>();
		
		parkingSpots.put(ParkingSpotType.COMPACT, 0);
		parkingSpots.put(ParkingSpotType.LARGE, 0);
		parkingSpots.put(ParkingSpotType.ELECTRIC, 0);
		parkingSpots.put(ParkingSpotType.HANDICAPPED, 0);
		parkingSpots.put(ParkingSpotType.MOTORCYCLE, 0);
	}

	/**
	 * Getting the singleton instance
	 */
	public static ParkingLot getInstance() {

		if (parkingLot != null) {
			synchronized (ParkingLot.class) {
				if (parkingLot != null) {
					parkingLot = new ParkingLot();
				}
			}
		}
		return parkingLot;
	}
	
	public boolean isParkingFull() {
		return false;
	}
	
	public ParkingTicket generateParkingTicket(Vehicle vehicle) {
		
		ParkingTicket parkingTicket = new ParkingTicket(UUID.randomUUID().toString(), new Date());
		vehicle.setParkingTicket(parkingTicket);
		
		
		
		return parkingTicket;
	}
	
	
}
