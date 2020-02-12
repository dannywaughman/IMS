package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.ItemOrder;

public class ItemOrderDaoMySql implements Dao<ItemOrder>{
	
	public static final Logger LOGGER = Logger.getLogger(OrderDaoMySql.class);

	private String jdbcConnectionUrl;
	private String username;
	private String password;

	public ItemOrderDaoMySql(String username, String password) {
		this.jdbcConnectionUrl = "jdbc:mysql://35.204.115.155:3306/projectdb";
		this.username = username;
		this.password = password;
	}

	public ItemOrderDaoMySql(String jdbcConnectionUrl, String username, String password) {
		this.jdbcConnectionUrl = "jdbc:mysql://35.204.115.155:3306/projectdb";
		this.username = username;
		this.password = password;
	}

	ItemOrder itemOrderFromResultSet(ResultSet resultSet) throws SQLException {
		Long id = resultSet.getLong("id");
		Long orderId = resultSet.getLong("order_id");
		Long customerId = resultSet.getLong("customer_id");
		Long totalValue = resultSet.getLong("total_value");
		return new ItemOrder(id, orderId, customerId, totalValue);
	}
	
	@Override
	public List<ItemOrder> readAll() {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM items_orders");) {
			ArrayList<ItemOrder> orders = new ArrayList<>();
			while (resultSet.next()) {
				orders.add(itemOrderFromResultSet(resultSet));
			}
			return orders;
		} catch (SQLException e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
	}
	
	public ItemOrder readLatest() {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM items_orders ORDER BY id DESC LIMIT 1");) {
			resultSet.next();
			return itemOrderFromResultSet(resultSet);
		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
		return null;
	}
	
	@Override
	public ItemOrder create(ItemOrder itemOrder) {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement statement = connection.createStatement();) {
			statement.executeUpdate("INSERT INTO items_orders(order_id, customer_id, total_value) values('" + itemOrder.getOrderId()
					+ "','" + itemOrder.getCustomerId() + "','" + itemOrder.getItemQuantity() + "')");
			return readLatest();
		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
		return null;
	}
	
	public ItemOrder readItemOrder(Long id) {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM items_orders WHERE id = " + id);) {
			resultSet.next();
			return itemOrderFromResultSet(resultSet);
		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
		return null;
	}
	
	@Override
	public ItemOrder update(ItemOrder itemOrder) {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement statement = connection.createStatement();) {
			statement.executeUpdate("UPDATE items_orders SET order_id ='" + itemOrder.getOrderId() + "', customer_id ='"
					+ itemOrder.getCustomerId() + "', item_quantity ='" + itemOrder.getItemQuantity() + "' WHERE id =" + itemOrder.getId());
			return readItemOrder(itemOrder.getId());
		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
		return null;
	}
	
	public void delete(long id) {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement statement = connection.createStatement();) {
			statement.executeUpdate("DELETE FROM items_orders WHERE id = " + id);
		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
	}


}
