package com.lld.parkinglot.model.vehicle;

import com.lld.parkinglot.enums.VehicleType;

public class VanVehicle extends Vehicle {

	public VanVehicle(String plateNumber) {
		super(plateNumber, VehicleType.VAN);
	}
}
