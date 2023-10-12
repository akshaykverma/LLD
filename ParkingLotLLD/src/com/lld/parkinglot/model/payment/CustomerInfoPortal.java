package com.lld.parkinglot.model.payment;

import com.lld.parkinglot.model.parking.ParkingFloor;

public class CustomerInfoPortal implements PaymentCollector {
	
	private int id;
	private ParkingFloor parkingFloor;
	
	public CustomerInfoPortal(int id, ParkingFloor parkingFloor) {
		this.id = id;
		this.parkingFloor = parkingFloor;
	}

	@Override
	public void collectPayment() {
		
	}
}
