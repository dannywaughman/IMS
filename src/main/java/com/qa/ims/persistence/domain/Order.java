package com.qa.ims.persistence.domain;

public class Order {

	private long id;
	private long customerId;
	private float totalValue;

	public Order(long customerId, float totalValue) {
		this.customerId = customerId;
		this.totalValue = totalValue;
	}

	public Order(long id, long customerId, float totalValue) {
		this.id = id;
		this.customerId = customerId;
		this.totalValue = totalValue;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public float getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(float totalValue) {
		this.totalValue = totalValue;
	}

	public String toString() {
		return "id:" + id + " - Customer ID:" + customerId + "Total Value: " + totalValue;
	}

}
