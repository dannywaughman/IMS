package com.qa.ims;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Customer;

public class Runner {

	public static final Logger LOGGER = Logger.getLogger(Runner.class);
	
	public static void main(String[] args) {
		Ims ims = new Ims();
		ims.imsSystem();
		
	}

}
