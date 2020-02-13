package com.qa.ims.persistence.domain;

public class Item {
	
	private long id;
	private String itemName;
	private float itemValue;
	
	public Item (String itemName,float itemValue) {
		this.itemName = itemName;
		this.itemValue = itemValue;
	}
	
	public Item(long id, String itemName, float itemValue) {
		this.id = id;
		this.itemName = itemName;
		this.itemValue = itemValue;
	}



	public Item() {
		// TODO Auto-generated constructor stub
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
	
	public String toString() {
		return "id:" + id + " - Item: " + itemName + " - Price: " + itemValue;
	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Customer other = (Customer) obj;
//		if (firstName == null) {
//			if (other.firstName != null)
//				return false;
//		} else if (!firstName.equals(other.firstName))
//			return false;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (surname == null) {
//			if (other.surname != null)
//				return false;
//		} else if (!surname.equals(other.surname))
//			return false;
//		return true;
//	}

}
