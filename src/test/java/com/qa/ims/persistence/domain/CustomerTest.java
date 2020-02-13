package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CustomerTest {

	@Test
    public void testCustomerOne() {
        Customer customer = new Customer(null, null);
        customer.setFirstName("Mr");
        customer.setSurname("Bean");
        assertTrue(customer.getFirstName() == "Mr");
        assertTrue(customer.getSurname() == "Bean");
}
	
	@Test
    public void testCustomerTwo() {
        Customer customer = new Customer(null, null);
        customer.setFirstName("Mr");
        customer.setSurname("Bean");
        assertTrue(customer.getFirstName() == "Mr");
        assertTrue(customer.getSurname() == "Bean");
}
	
}