package org.india.controller;

import org.india.model.Customer;
import org.india.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@Autowired
	CustomerService custService;

	@RequestMapping("/")
	public String customer() {
		return "home";
	}

	@RequestMapping("addCustomer")
	public String addCustomer(Customer cust) {
		custService.addCustomer(cust);
		return "home";
	}

	@RequestMapping("deleteCustomer")
	public void deleteCustomerById(@RequestParam int id) {
		custService.deleteCustomerById(id);
	}

	@RequestMapping(path = "getCustomer")
	public ModelAndView getCustomerById(@RequestParam int cid) {
		ModelAndView mv = new ModelAndView("customer");
		Customer customer = custService.getCustomerById(cid);
		mv.addObject(customer);
		return mv;
	}
}
