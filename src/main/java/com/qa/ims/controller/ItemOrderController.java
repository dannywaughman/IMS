//package com.qa.ims.controller;
//
//import java.util.List;
//
//import org.apache.log4j.Logger;
//
//import com.qa.ims.persistence.domain.ItemOrder;
//import com.qa.ims.services.CrudServices;
//import com.qa.ims.utils.Utils;
//
//public class ItemOrderController implements CrudController<ItemOrder> {
//
//	public static final Logger LOGGER = Logger.getLogger(ItemOrderController.class);
//
//	private CrudServices<ItemOrder> itemOrderService;
//
//	public ItemOrderController(CrudServices<ItemOrder> itemOrderService) {
//		this.itemOrderService = itemOrderService;
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
//	 * Creates an ItemOrder by taking in user input
//	 */
//	@Override
//	public ItemOrder create() {
//		LOGGER.info("Please enter order ID: ");
//		long orderId = Long.valueOf(getInput());
//		LOGGER.info("Please enter customer ID: ");
//		long customerId = Long.valueOf(getInput());
//		LOGGER.info("Please enter item quantity: ");
//		long itemQuantity = Long.valueOf(getInput());
//		ItemOrder itemOrder = itemOrderService.create(new ItemOrder(orderId, customerId, itemQuantity));
//		LOGGER.info("ItemOrder created!");
//		return itemOrder;
//	}
//
//	/**
//	 * Reads all ItemOrders to the logger
//	 */
//	@Override
//	public List<ItemOrder> readAll() {
//		List<ItemOrder> itemOrders = itemOrderService.readAll();
//		for (ItemOrder itemOrder : itemOrders) {
//			LOGGER.info(itemOrder.toString());
//		}
//		return itemOrders;
//	}
//
//	/**
//	 * Updates an existing ItemOrder by taking in user input
//	 */
//	@Override
//	public ItemOrder update() {
//		LOGGER.info("Please enter the id of the ItemOrder you would like to update: ");
//		Long id = Long.valueOf(getInput());
//		LOGGER.info("Please enter order ID: ");
//		Long orderId = Long.valueOf(getInput());
//		LOGGER.info("Please enter customer ID: ");
//		Long customerId = Long.valueOf(getInput());
//		LOGGER.info("Please enter item quantity: ");
//		long itemQuantity = Long.valueOf(getInput());
//		ItemOrder itemOrder = itemOrderService.update(new ItemOrder(id, orderId, customerId, itemQuantity));
//		LOGGER.info("ItemOrder Updated!");
//		return itemOrder;
//	}
//
//	/**
//	 * Deletes an existing ItemOrder by taking the id of the item
//	 */
//	@Override
//	public void delete() {
//		LOGGER.info("Please enter the id of the ItemOrder you would like to delete: ");
//		Long id = Long.valueOf(getInput());
//		itemOrderService.delete(id);
//		LOGGER.info("ItemOrder Deleted!");
//	}
//
//}
