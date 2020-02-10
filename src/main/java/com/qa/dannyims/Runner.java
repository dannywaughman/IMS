package com.qa.dannyims;

import java.sql.SQLException;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) throws SQLException {

		MySqlCustomerDao dao1 = new MySqlCustomerDao();

		ArrayList<Customer> customers = dao1.readAll();

		for (Customer customer : customers) {

			System.out.println(customer.getId() + ": " + customer.getCustomerName());
			
		MySqlItemDao dao2 = new MySqlItemDao();
		
		ArrayList<Item> items = dao2.readAll();
		
		for (Item item : items) {
			
			System.out.println(item.getId() + ": " + item.getItem_name());
			
		}

		}

	}

}
