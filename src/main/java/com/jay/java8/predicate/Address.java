package com.jay.java8.predicate;

public class Address {
	private String street;
	private String state;
	private String city;
	private String district;
	private Integer pincode;

	public Address(String street, String state, String city, String district, Integer pincode) {
		this.street = street;
		this.state = state;
		this.city = city;
		this.district = district;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", city=" + city + ", district=" + district
				+ ", pincode=" + pincode + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
}
