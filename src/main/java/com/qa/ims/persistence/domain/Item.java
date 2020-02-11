package com.qa.ims.persistence.domain;

public class Item {
	
	private long id;
	private String itemName;
	private float itemValue;
	
	public Item (long id, String itemName,float itemValue) {
		this.itemName = itemName;
		this.itemValue = itemValue;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getitemName() {
		return itemName;
	}

	public void setitemName(String item_name) {
		this.itemName = item_name;
	}

	public float getitemValue() {
		return itemValue;
	}

	public void setitemValue(float item_value) {
		this.itemValue = item_value;
	}

}
