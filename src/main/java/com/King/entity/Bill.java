package com.King.entity;

import com.King.enums.PaymentMode;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "invoice_no")
	private int id;

	private double roomCharge;
	private double roomService;
	private double restoCharge;
	private double barCharge;
	private double miscCharge;
	private boolean ifLateCheckout;
	private String paymentDate;
///	@Enumerated(EnumType.STRING)
	private String paymentMode;
	private long creditCardNo;
	private String expireDate;
	private long chequeNo;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "guest_id")
	private Guest guest;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "booking_id")
	private Booking booking;

	
	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRoomCharge() {
		return roomCharge;
	}

	public void setRoomCharge(double roomCharge) {
		this.roomCharge = roomCharge;
	}

	public double getRoomService() {
		return roomService;
	}

	public void setRoomService(double roomService) {
		this.roomService = roomService;
	}

	public double getRestoCharge() {
		return restoCharge;
	}

	public void setRestoCharge(double restoCharge) {
		this.restoCharge = restoCharge;
	}

	public double getBarCharge() {
		return barCharge;
	}

	public void setBarCharge(double barCharge) {
		this.barCharge = barCharge;
	}

	public double getMiscCharge() {
		return miscCharge;
	}

	public void setMiscCharge(double miscCharge) {
		this.miscCharge = miscCharge;
	}

	public boolean isIfLateCheckout() {
		return ifLateCheckout;
	}

	public void setIfLateCheckout(boolean ifLateCheckout) {
		this.ifLateCheckout = ifLateCheckout;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public long getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(long creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public long getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(long chequeNo) {
		this.chequeNo = chequeNo;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", roomCharge=" + roomCharge + ", roomService=" + roomService + ", restoCharge="
				+ restoCharge + ", barCharge=" + barCharge + ", miscCharge=" + miscCharge + ", ifLateCheckout="
				+ ifLateCheckout + ", paymentDate=" + paymentDate + ", paymentMode=" + paymentMode + ", creditCardNo="
				+ creditCardNo + ", expireDate=" + expireDate + ", chequeNo=" + chequeNo + ", guest=" + guest
				+ ", booking=" + booking + "]";
	}

}
