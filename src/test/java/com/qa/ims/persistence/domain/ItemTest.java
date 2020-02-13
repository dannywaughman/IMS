package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ItemTest {
	
	@Test
    public void testItemOne() {
        Item item = new Item();
        item.setitemValue(3);
        item.setitemName("Beverage");
        assertTrue(item.getitemName() == "Beverage");
        assertTrue(item.getitemValue() == 3);
}

}
