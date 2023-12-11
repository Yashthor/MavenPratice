package com.springDemo;

public class Person {
	
	int id;
	
	Address adress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public Person(int id, Address adress) {
		super();
		this.id = id;
		this.adress = adress;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", adress=" + adress + "]";
	}
	
	private void writeMessage() {
		System.out.println("welcome");
	}
	
	private void afterMessage() {
		System.out.println("thank you");
	}
	
	

}
