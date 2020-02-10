package com.qa.dannyims;

import java.util.ArrayList;

public interface ProjectDao<T> {
	
		// CRUD

		// Create
		public void create(T t);

		// Read
		public ArrayList<T> readAll();

		// Update
		public void update(T t);

		// Delete
		public void delete(int id);

}
