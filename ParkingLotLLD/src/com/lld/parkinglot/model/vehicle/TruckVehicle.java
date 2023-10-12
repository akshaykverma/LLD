package com.lld.parkinglot.model.vehicle;

import com.lld.parkinglot.enums.VehicleType;

public class TruckVehicle extends Vehicle {
	
	public TruckVehicle(String plateNumber) {
		super(plateNumber, VehicleType.TRUCK);
	}
}
