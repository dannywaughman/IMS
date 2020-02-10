package com.qa.dannyims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MySqlItemDao implements ProjectDao<Item> {
	
	private Connection connection;

	public MySqlItemDao() throws SQLException {

		this.connection = DriverManager.getConnection("project:mysql://34.90.101.90:3306", "dannyproject",
				"qaproject");

	}

// Create

	public void create(Item item) {

	}

//	Read

	public ArrayList<Item> readAll() {
		ArrayList<Item> items = new ArrayList<Item>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from Items");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String itemName = resultSet.getString("item_name");
				float itemValue = resultSet.getFloat("item_value");
				items.add(new Item(id, itemName, itemValue));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return items;
	}

//	Update

	public void update(Item t) {

	}

//	Delete

	public void delete(int id) {

	}


}
