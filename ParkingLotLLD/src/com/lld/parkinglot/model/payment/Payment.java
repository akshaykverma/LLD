package com.lld.parkinglot.model.payment;

import java.util.Date;

import com.lld.parkinglot.enums.PaymentType;
import com.lld.parkinglot.model.user.Customer;

public abstract class Payment {
	
	private PaymentType paymentType; 
	private Date creationDate;
	private int hourlyRate = 20;
	private PaymentCollector paymentCollector;
	
	public Payment(PaymentType paymentType, Date creationDate, int hourlyRate, PaymentCollector paymentCollector) {
		this.paymentType = paymentType;
		this.creationDate = creationDate;
		this.hourlyRate = hourlyRate;
		this.paymentCollector = paymentCollector;
	}

	public abstract boolean processPayment(Customer customer, PaymentType paymentType);

	private double calculatePrice() {
		
		
		
		return 0;
	}
	
}
