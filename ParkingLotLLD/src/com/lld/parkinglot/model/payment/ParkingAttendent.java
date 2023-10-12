package com.lld.parkinglot.model.payment;

public class ParkingAttendent implements PaymentCollector {

	private int id;
	private String name;
	
	public ParkingAttendent(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void collectPayment() {
		
	}
}
