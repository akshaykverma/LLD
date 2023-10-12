package com.lld.parkinglot.model.parking;

import java.util.Date;

import com.lld.parkinglot.enums.ParkingTicketStatus;
import com.lld.parkinglot.enums.PaymentStatus;

public class ParkingTicket {
	
	private String ticketId;
	private Date issuedAt; 
	private Date payedAt;
	private PaymentStatus paymentStatus;
	private ParkingTicketStatus parkingTicketStatus;
	
	public ParkingTicket(String ticketId, Date issuedAt) {
		this.ticketId = ticketId;
		this.issuedAt = issuedAt;
		this.parkingTicketStatus = ParkingTicketStatus.ACTIVE;
		this.paymentStatus = PaymentStatus.NOT_PAID;
	}
	
	public String getTicketId() {
		return ticketId;
	}

	public Date getIssuedAt() {
		return issuedAt;
	}
	public void setIssuedAt(Date issuedAt) {
		this.issuedAt = issuedAt;
	}
	public Date getPayedAt() {
		return payedAt;
	}
	public void setPayedAt(Date payedAt) {
		this.payedAt = payedAt;
	}
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public ParkingTicketStatus getParkingTicketStatus() {
		return parkingTicketStatus;
	}
	public void setParkingTicketStatus(ParkingTicketStatus parkingTicketStatus) {
		this.parkingTicketStatus = parkingTicketStatus;
	}
}
