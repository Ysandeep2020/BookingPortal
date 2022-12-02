package com.King.model;

import com.King.enums.PaymentMode;

public class BillModel {

	private double roomCharge;
	private double roomService;
	private double restoCharge;
	private double barCharge;
	private double miscCharge;
	private boolean ifLateCheckout;
	private String paymentDate;
	private String paymentMode;
	private long creditCardNo;
	private String expireDate;
	private long chequeNo;

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	private int guestId;

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
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

	@Override
	public String toString() {
		return "BillModel [roomCharge=" + roomCharge + ", roomService=" + roomService + ", restoCharge=" + restoCharge
				+ ", barCharge=" + barCharge + ", miscCharge=" + miscCharge + ", ifLateCheckout=" + ifLateCheckout
				+ ", paymentDate=" + paymentDate + ", paymentMode=" + paymentMode + ", creditCardNo=" + creditCardNo
				+ ", expireDate=" + expireDate + ", chequeNo=" + chequeNo + ", guestId=" + guestId + "]";
	}

}
