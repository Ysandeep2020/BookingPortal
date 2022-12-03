package com.King.model;

import com.King.entity.Address;

public class HotelModel {

	private String name;
	private String phone;
	private Address address;
//	@JsonProperty(access = Access.READ_ONLY)
//	private List<Room> rooms;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "HotelModel [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

}
