package com.qa.dannyims;

public class Item {
	
	private int id;
	private String item_name;
	private float item_value;
	
	public Item (int id, String item_name,float item_value) {
		this.item_name = item_name;
		this.item_value = item_value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public float getItem_value() {
		return item_value;
	}

	public void setItem_value(float item_value) {
		this.item_value = item_value;
	}

}
