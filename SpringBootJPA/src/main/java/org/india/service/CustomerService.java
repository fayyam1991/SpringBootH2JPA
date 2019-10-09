package org.india.service;

import java.util.List;

import org.india.model.Customer;

public interface CustomerService {

	public List<Customer> getallCustomer();

	public void addCustomer(Customer cust);

	public void deleteCustomerById(int cid);

	public void updateCustomer(Customer cust);

	public Customer getCustomerById(int id);
}
