package com.qa.ims.persistence.domain;

public class ItemOrder {

	private long id;
	private long orderId;
	private long customerId;
	private long itemQuantity;

	
	public ItemOrder (long orderId, long customerId, long itemQuantity){
		this.orderId = orderId;
		this.customerId = customerId;
		this.itemQuantity = itemQuantity;
	}
	
	public ItemOrder(long id, long orderId, long customerId, long itemQuantity) {
		this.id = id;
		this.orderId = orderId;
		this.customerId = customerId;
		this.itemQuantity = itemQuantity;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

}
