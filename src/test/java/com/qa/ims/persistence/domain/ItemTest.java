package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ItemTest {

	private Item item;
	private Item other;

	@Before
	public void setUp() {
		item = new Item(1L, "Beverage", 5);
		other = new Item(1L, "Beverage", 5);
	}

	@Test
	public void settersTest() {
		assertNotNull(item.getitemValue());

//		item.setId(null);
		item.setitemName(null);
//		assertNull(item.getId());
		assertNull(item.getitemName());

	}

	@Test
	public void equalsWithNull() {
		assertFalse(item.equals(null));
	}

	@Test
	public void equalsWithDifferentObject() {
		assertFalse(item.equals(new Object()));
	}

//	@Test
//	public void createItemWithId() {
//		assertEquals(1L, item.getId(), 0);
//		assertEquals("Beverage", item.getitemName());
//		assertEquals("5.0", item.getitemValue());
//	}

	@Test
	public void checkEquality() {
		assertTrue(item.equals(item));
	}

	@Test
	public void checkEqualityBetweenDifferentObjects() {
		item.setitemName("Beverage");
		other.setitemName("Beverage");
		item.setitemValue(5);
		other.setitemValue(5);
		assertTrue(item.equals(other));
	}

	@Test
	public void itemNameNullButOtherNameNotNull() {
		item.setitemName(null);
		assertFalse(item.equals(other));
	}

	@Test
	public void itemNamesNotEqual() {
		other.setitemName("A Drink");
		assertFalse(item.equals(other));
	}

	@Test
	public void checkEqualityBetweenDifferentObjectsNullName() {
		item.setitemName(null);
		other.setitemName(null);
		assertTrue(item.equals(other));
	}

	@Test
	public void nullId() {
		item.setId(0);
		assertFalse(item.equals(other));
	}

	@Test
	public void nullIdOnBoth() {
		item.setId(0);
		other.setId(0);
		assertTrue(item.equals(other));
	}

	@Test
	public void otherIdDifferent() {
		other.setId(0);
		assertFalse(item.equals(other));
	}

	@Test
	public void nullItemValue() {
		item.setitemValue(0);
		assertFalse(item.equals(other));
	}

	@Test
	public void nullItemValueOnBoth() {
		item.setitemValue(0);
		other.setitemValue(0);
		assertTrue(item.equals(other));
	}

	@Test
	public void otheritemValueDifferent() {
		other.setitemValue(10);
		assertFalse(item.equals(other));
	}

	@Test
	public void hashCodeTest() {
		assertEquals(item.hashCode(), other.hashCode());
	}

	@Test
	public void hashCodeTestWithNull() {
		Item item = new Item(null, 0);
		Item other = new Item(null, 0);
		assertEquals(item.hashCode(), other.hashCode());
	}

	@Test
	public void toStringTest() {
		String toString = "id:1 - Item: Beverage - Price: 5.0";
		assertEquals(toString, item.toString());
	}

}
