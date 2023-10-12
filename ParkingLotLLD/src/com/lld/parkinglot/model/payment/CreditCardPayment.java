package com.lld.parkinglot.model.payment;

import java.util.Date;

import com.lld.parkinglot.enums.PaymentType;
import com.lld.parkinglot.model.user.Customer;

public class CreditCardPayment extends Payment {
	
	public CreditCardPayment(PaymentType paymentType, Date creationDate, int hourlyRate,
			PaymentCollector paymentCollector) {
		super(paymentType, creationDate, hourlyRate, paymentCollector);
	}

	@Override
	public boolean processPayment(Customer customer, PaymentType paymentType) {
		return false;
	}

}
