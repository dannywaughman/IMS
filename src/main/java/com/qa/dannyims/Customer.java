package com.qa.dannyims;

public class Customer {

	private int id;
	private String customerName;

	public Customer(int id, String customerName) {
		this.id = id;
		this.customerName = customerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
