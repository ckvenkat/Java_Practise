package com.display.companydetails;

public class Address {
	private String state;
	private String country;
	public Address(){}
	public Address(String state, String country) {
		this.state = state;
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String toString() {
		return String.format("%-15s %s\n", state,country) ;
	}

}
