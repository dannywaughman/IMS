package com.qa.ims.persistence.dao;

import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.log4j.Logger;
//
//import com.qa.ims.persistence.domain.Item;
//import com.qa.ims.persistence.domain.Order;
//
//public class OrderDaoMySql implements Dao<Order> {
//
//	public static final Logger LOGGER = Logger.getLogger(OrderDaoMySql.class);
//
//	private String jdbcConnectionUrl;
//	private String username;
//	private String password;
//
//	public OrderDaoMySql(String username, String password) {
//		this.jdbcConnectionUrl = "jdbc:mysql://35.204.115.155:3306/projectdb";
//		this.username = username;
//		this.password = password;
//	}
//	
//	public OrderDaoMySql(String jdbcConnectionUrl, String username, String password) {
//		this.jdbcConnectionUrl = jdbcConnectionUrl;
//		this.username = username;
//		this.password = password;
//	}
//	
////	Order OrderFromResultSet(ResultSet resultSet) throws SQLException {
////		Long id = resultSet.getLong("id");
////		long customerId = resultSet.getLong("customer_id");
////		ArrayList<Item> items = resultSet.getArray("item_name");
////		float orderValue = resultSet.getInt("item_value");
////		return new Item(id, customer_id, item_value);
////	}
//	
//	
//	
//	
//	
//}
