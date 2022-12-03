package com.King.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "booking_id")
	private int id;
	@Column(name = "booking_date")
	private String bookingDate;
	@Column(name = "booking_time")
	private String bookingTime;
	@Column(name = "arrival_date")
	private String arrivalDate;
	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	@Column(name = "depareture_date")
	private String departureDate;
	@Column(name = "est_arrival_date")
	private String estArrivalDate;
	@Column(name = "est_departure_date")
	private String estDepartureDate;
	@Column(name = "num_adults")
	private int numAdults;
	@Column(name = "num_children")
	private int numChildren;
	@Column(name = "special_req")
	private String sepcialReq;

	@OneToMany(mappedBy = "booking")
	@JsonIgnore
	private List<Bill> bills;

	// TODO........
	@OneToOne()
	@JoinColumn(name = "guest_id")
	private Guest guest;

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookingDate=" + bookingDate + ", bookingTime=" + bookingTime + ", arrivalDate="
				+ arrivalDate + ", departureDate=" + departureDate + ", estArrivalDate=" + estArrivalDate
				+ ", estDepartureDate=" + estDepartureDate + ", numAdults=" + numAdults + ", numChildren=" + numChildren
				+ ", sepcialReq=" + sepcialReq + ", bills=" + bills + ", guest=" + guest + "]";
	}

	
}
