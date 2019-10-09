package org.india.service;

import java.util.List;

import org.india.model.Customer;
import org.india.reposiory.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultCustomerService implements CustomerService {

	@Autowired
	CustomerRepository custrRepository;

	@Override
	public List<Customer> getallCustomer() {
		return null;
	}

	@Override
	public void addCustomer(Customer cust) {
		custrRepository.save(cust);

	}

	@Override
	public void deleteCustomerById(int cid) {
		custrRepository.deleteById(cid);
	}

	@Override
	public void updateCustomer(Customer cust) {
		custrRepository.save(cust);

	}

	@Override
	public Customer getCustomerById(int id) {
		return custrRepository.findById(id).orElse(null);
	}

}
