package com.lld.parkinglot.model.vehicle;

import com.lld.parkinglot.enums.VehicleType;

public class ElectricVehicle extends Vehicle{

	public ElectricVehicle(String plateNumber) {
		super(plateNumber, VehicleType.ELECTRIC);
	}
}
