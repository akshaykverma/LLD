package com.lld.parkinglot.model.vehicle;

import com.lld.parkinglot.enums.VehicleType;

public class MotorcycleVehicle extends Vehicle {

	public MotorcycleVehicle(String plateNumber) {
		super(plateNumber, VehicleType.MOTORCYCLE);
	}
}
