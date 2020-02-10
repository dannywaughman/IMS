package com.qa.dannyims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MySqlCustomerDao implements ProjectDao<Customer> {

	private Connection connection;

	public MySqlCustomerDao() throws SQLException {

		this.connection = DriverManager.getConnection("project:mysql://34.90.101.90:3306", "dannyproject",
				"qaproject");

	}

// Create

	public void create(Customer customer) {

	}

//	Read

	public ArrayList<Customer> readAll() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from Customers");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String customerName = resultSet.getString("customer_name");
				customers.add(new Customer(id, customerName));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customers;
	}

//	Update

	public void update(Customer t) {

	}

//	Delete

	public void delete(int id) {

	}

}
