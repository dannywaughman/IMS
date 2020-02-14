package com.qa.ims;

import org.apache.log4j.Logger;

import com.qa.ims.controller.Action;
import com.qa.ims.controller.CrudController;
import com.qa.ims.controller.CustomerController;
import com.qa.ims.controller.ItemController;
import com.qa.ims.persistence.dao.CustomerDaoMysql;
import com.qa.ims.persistence.dao.ItemDaoMySql;
import com.qa.ims.persistence.domain.Domain;
import com.qa.ims.services.CustomerServices;
import com.qa.ims.services.ItemServices;
import com.qa.ims.utils.Utils;

public class Ims {

	public static final Logger LOGGER = Logger.getLogger(Ims.class);

	/** 
	 * imsSystem is the method that provides the user interface for the application
	 */
	public void imsSystem() {
		LOGGER.info("Please enter your username: ");
		String username = Utils.getInput();
		LOGGER.info("Please enter your password: ");
		String password = Utils.getInput();

		LOGGER.info("Which entity would you like to use?");
		Domain.printDomains();

		Domain domain = Domain.getDomain();
		LOGGER.info("What would you like to do with " + domain.name().toLowerCase() + ":");

		Action.printActions();
		Action action = Action.getAction();

		switch (domain) {
		case CUSTOMER:
			CustomerController customerController = new CustomerController(
					new CustomerServices(new CustomerDaoMysql(username, password)));
			doAction(customerController, action);
			break;
		case ITEM:
			ItemController itemController = new ItemController(new ItemServices(new ItemDaoMySql(username, password)));
			doAction(itemController, action);
			break;
		case ORDER: 
			break;
		case STOP:
			break;
		default:
			break;
		}

	}

	/** 
	 * doAction refers to the necessary CRUD operation, called by imsSystem in response to user input
	 * @param crudController
	 * @param action
	 */
	public void doAction(CrudController crudController, Action action) {
		switch (action) {
		case CREATE:
			crudController.create();
			break;
		case READ:
			crudController.readAll();
			break;
		case UPDATE:
			crudController.update();
			break;
		case DELETE:
			crudController.delete();
			break;
		case RETURN:
			break;
		default:
			break;
		}
	}
}
