package com.King.model;

import java.util.List;

import com.King.entity.Address;
import com.King.entity.Bill;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class GuestModel {

	private String title;
	private String firstName;
	private String lastName;
	private String Dob;
	private String gender;
	private String mobile;
	private String email;
	private String password;
	private long passportNo;
	private Address address;
	@JsonProperty(access = Access.READ_ONLY)
	private List<Bill> bills;

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
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

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
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

	@Override
	public String toString() {
		return "GuestModel [title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + ", Dob=" + Dob
				+ ", gender=" + gender + ", mobile=" + mobile + ", email=" + email + ", password=" + password
				+ ", passportNo=" + passportNo + ", address=" + address + ", bills=" + bills + "]";
	}

}
