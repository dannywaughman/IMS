package com.qa.ims.services;

import java.util.List;

import com.qa.ims.persistence.dao.Dao;
import com.qa.ims.persistence.domain.ItemOrder;

public class ItemOrderServices implements CrudServices<ItemOrder> {

	Dao<ItemOrder> itemOrderDao;

	public ItemOrderServices(Dao<ItemOrder> itemOrderDao) {
		this.itemOrderDao = itemOrderDao;
	}

	public ItemOrder create(ItemOrder itemOrder) {
		return itemOrderDao.create(itemOrder);
	}

	public List<ItemOrder> readAll() {
		return itemOrderDao.readAll();
	}

	public ItemOrder update(ItemOrder itemOrder) {
		return itemOrderDao.update(itemOrder);
	}

	public void delete(Long id) {
		itemOrderDao.delete(id);
	}

}
