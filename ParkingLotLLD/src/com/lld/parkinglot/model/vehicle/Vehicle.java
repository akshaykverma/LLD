package com.lld.parkinglot.model.vehicle;

import com.lld.parkinglot.enums.VehicleType;
import com.lld.parkinglot.model.parking.ParkingTicket;
import com.lld.parkinglot.model.user.Customer;

public class Vehicle {
	
	private String plateNumber;
	private Customer owner;
	private VehicleType vehicleType;
	private ParkingTicket parkingTicket;
	
	public Vehicle(String plateNumber, VehicleType vehicleType) {
		this.plateNumber = plateNumber;
		this.vehicleType = vehicleType;
	}

	public ParkingTicket getParkingTicket() {
		return parkingTicket;
	}

	public void setParkingTicket(ParkingTicket parkingTicket) {
		this.parkingTicket = parkingTicket;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public Customer getOwner() {
		return owner;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}
	
	
}
