package com.springDemo;

public class Address {
	
	String colonyNumber;
	
	String pincode;

	public String getColonyNumber() {
		return colonyNumber;
	}

	public void setColonyNumber(String colonyNumber) {
		this.colonyNumber = colonyNumber;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Address(String colonyNumber, String pincode) {
		super();
		this.colonyNumber = colonyNumber;
		this.pincode = pincode;
	}

	public Address() {
	}

	@Override
	public String toString() {
		return "Address [colonyNumber=" + colonyNumber + ", pincode=" + pincode + "]";
	}
	
	

}
