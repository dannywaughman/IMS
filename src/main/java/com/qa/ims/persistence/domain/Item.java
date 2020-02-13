package com.qa.ims.persistence.domain;

public class Item {

	private long id;
	private String itemName;
	private float itemValue;

	public Item(String itemName, float itemValue) {
		this.itemName = itemName;
		this.itemValue = itemValue;
	}

	public Item(long id, String itemName, float itemValue) {
		this.id = id;
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

	public void setitemName(String itemName) {
		this.itemName = itemName;
	}

	public float getitemValue() {
		return itemValue;
	}

	public void setitemValue(float itemValue) {
		this.itemValue = itemValue;
	}

	public String toString() {
		return "id:" + id + " - Item: " + itemName + " - Price: " + itemValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + Float.floatToIntBits(itemValue);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		else if (Float.floatToIntBits(itemValue) != Float.floatToIntBits(other.itemValue))
			return false;
		return true;
	}


}
