package com.lld.parkinglot.model.payment;

import com.lld.parkinglot.model.parking.ParkingExit;

public class AutomatedExitPanel implements PaymentCollector {
	
	private int id;
	private ParkingExit parkingExit;
	
	public AutomatedExitPanel(int id, ParkingExit exitTerminal) {
		this.id = id;
		this.parkingExit = exitTerminal;
	}

	@Override
	public void collectPayment() {
		
	}
}
