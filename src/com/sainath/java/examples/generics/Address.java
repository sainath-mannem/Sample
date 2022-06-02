package com.sainath.java.examples.generics;
public class Address {
    @Override
	public String toString() {
		return "Address [street=" + street + ", streetNo=" + streetNo + "]";
	}
	private String street;
    private String streetNo;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

    // Constructors, Getters and Setters, toString()
    
}