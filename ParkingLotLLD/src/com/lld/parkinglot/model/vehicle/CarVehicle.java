package com.lld.parkinglot.model.vehicle;

import com.lld.parkinglot.enums.VehicleType;

public class CarVehicle extends Vehicle{

	public CarVehicle(String plateNumber) {
		super(plateNumber, VehicleType.CAR);
	}
}
