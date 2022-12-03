package com.King.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "guest_id")
	private int id;
	@Column(name = "guest_title")
	private String title;
	private String firstName;
	private String lastName;
	private String dob;
	private String gender;
	private String mobile;
	private String email;
	private String password;
	private long passportNo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	@OneToMany(mappedBy = "guest")
	@JsonIgnore
	private List<Bill> bills;
	
	@OneToOne
	@JoinColumn(name = "booking_id")
	private Booking booking;

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	@Override
	public String toString() {
		return "Guest [id=" + id + ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + ", dob="
				+ dob + ", gender=" + gender + ", mobile=" + mobile + ", email=" + email + ", password=" + password
				+ ", passportNo=" + passportNo + ", address=" + address + ", bills=" + bills + ", booking=" + booking
				+ "]";
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(long passportNo) {
		this.passportNo = passportNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
