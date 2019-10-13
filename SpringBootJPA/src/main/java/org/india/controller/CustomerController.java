package org.india.controller;

import org.india.model.Customer;
import org.india.service.CustomerService;
import org.india.service.CustomerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@Autowired
	CustomerService custService;
	@Autowired
	CustomerValidator customerValidator;

	private static final String[] FIELDS = new String[] { "name", "tech" };

	@RequestMapping("/")
	public String customer() {
		return "home";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(customerValidator);
		binder.setAllowedFields(FIELDS);
	}

	@RequestMapping(value = "addCustomer", method = RequestMethod.POST)
	public ModelAndView addCustomer(@ModelAttribute("customer") Customer cust) {
		ModelAndView view = new ModelAndView("customer");
		custService.addCustomer(cust);
		return view;
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
