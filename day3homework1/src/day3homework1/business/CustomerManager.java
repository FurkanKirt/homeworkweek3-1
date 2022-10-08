package day3homework1.business;

import day3homework1.entities.Customer;

public class CustomerManager {
	private Customer customer;
	private CreditService creditService;

	public CustomerManager(Customer customer,CreditService creditService) {
		this.customer = customer;
		this.creditService=creditService;
	}

	public void save() {
		System.out.println("müþteri kaydedildi " + customer.getFirstName());
		creditService.calculate();
		creditService.save();
		
	}
	public void delete() {
		System.out.println("müþteri silindi " + customer.getFirstName());
	}
}
