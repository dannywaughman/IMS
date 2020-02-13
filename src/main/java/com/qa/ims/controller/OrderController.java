//package com.qa.ims.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.log4j.Logger;
//
//import com.qa.ims.persistence.dao.CustomerDaoMysql;
//import com.qa.ims.persistence.domain.Customer;
//import com.qa.ims.persistence.domain.ItemOrder;
//import com.qa.ims.persistence.domain.Order;
//import com.qa.ims.services.CrudServices;
//import com.qa.ims.utils.Utils;
//
//public class OrderController implements CrudController<Order> {
//
//	public static final Logger LOGGER = Logger.getLogger(OrderController.class);
//
//	private CrudServices<Order> orderService;
//
//	public OrderController(CrudServices<Order> orderService) {
//		this.orderService = orderService;
//	}
//
//	String getInput() {
//		return Utils.getInput();
//	}
//
//	float getInputFloat() {
//		return Utils.getInputFloat();
//	}
//
//	/**
//	 * Creates an order by taking in user input
//	 */
//	@Override
//	public Order create() {
//		LOGGER.info("Please enter customer ID: ");
//		Long customerId = Long.valueOf(getInput());
//		LOGGER.info("Please enter the id of the item you want to add: ");
//		long itemId = Long.valueOf(getInput());
//		Order order = orderService.create(new Order(????));
//		LOGGER.info("Order created!");
//		return order;
//	}
//
//	/**
//	 * Reads all orders to the logger
//	 */
//	@Override
//	public List<Order> readAll() {
//		List<Order> orders = orderService.readAll();
//		for (Order order : orders) {
//			LOGGER.info(order.toString());
//		}
//		return orders;
//	}
//
//	/**
//	 * Updates an existing order by taking in user input
//	 */
//	@Override
//	public Order update() {
//		LOGGER.info("Please enter the id of the order you would like to update: ");
//		Long id = Long.valueOf(getInput());
//		LOGGER.info("Please enter customer ID: ");
//		Long customerId = Long.valueOf(getInput());
//		LOGGER.info("Please enter total value: ");
//		float totalValue = getInputFloat();
//		Order order = orderService.update(new Order(???));
//		LOGGER.info("Order Updated!");
//		return order;
//	}
//
//	/**
//	 * Deletes an existing order by taking the id of the item
//	 */
//	@Override
//	public void delete() {
//		LOGGER.info("Please enter the id of the order you would like to delete: ");
//		Long id = Long.valueOf(getInput());
//		orderService.delete(id);
//		LOGGER.info("Order Deleted!");
//	}
//
//}
//