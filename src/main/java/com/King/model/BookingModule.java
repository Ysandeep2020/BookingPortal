package com.King.model;

import java.util.List;

import com.King.entity.Bill;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class BookingModule {
	private String bookingDate;
	private String bookingTime;
	private String arrivalDate;
	private String departureDate;
	private String estArrivalDate;
	private String estDepartureDate;
	private int numAdults;
	private int numChildren;
	private String sepcialReq;
	private int guestId;
	@JsonProperty(access = Access.READ_ONLY)
	private List<Bill> bills;

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getEstArrivalDate() {
		return estArrivalDate;
	}

	public void setEstArrivalDate(String estArrivalDate) {
		this.estArrivalDate = estArrivalDate;
	}

	public String getEstDepartureDate() {
		return estDepartureDate;
	}

	public void setEstDepartureDate(String estDepartureDate) {
		this.estDepartureDate = estDepartureDate;
	}

	public int getNumAdults() {
		return numAdults;
	}

	public void setNumAdults(int numAdults) {
		this.numAdults = numAdults;
	}

	public int getNumChildren() {
		return numChildren;
	}

	public void setNumChildren(int numChildren) {
		this.numChildren = numChildren;
	}

	public String getSepcialReq() {
		return sepcialReq;
	}

	public void setSepcialReq(String sepcialReq) {
		this.sepcialReq = sepcialReq;
	}

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	@Override
	public String toString() {
		return "BookingModule [bookingDate=" + bookingDate + ", bookingTime=" + bookingTime + ", arrivalDate="
				+ arrivalDate + ", departureDate=" + departureDate + ", estArrivalDate=" + estArrivalDate
				+ ", estDepartureDate=" + estDepartureDate + ", numAdults=" + numAdults + ", numChildren=" + numChildren
				+ ", sepcialReq=" + sepcialReq + ", guestId=" + guestId + ", bills=" + bills + "]";
	}

}
