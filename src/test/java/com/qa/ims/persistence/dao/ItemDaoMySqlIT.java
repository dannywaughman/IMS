//package com.qa.ims.persistence.dao;
//
//import static org.junit.Assert.assertTrue;
//
//import java.util.List;
//
//import org.junit.Test;
//
//import com.qa.ims.persistence.domain.Item;
//
//public class ItemDaoMySqlIT {
//	
//	@Test
//	public void testDatabaseHasValues() {
//		ItemDaoMySql itemDaoMySql = new ItemDaoMySql("root", "rootyroot");
//		List<Item> items = ItemDaoMySql.readAll();
//		assertTrue(items.size()>0);
//	}
//
//}
