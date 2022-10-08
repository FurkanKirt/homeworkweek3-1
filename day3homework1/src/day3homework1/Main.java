package day3homework1;

import day3homework1.business.CreditManager;
import day3homework1.business.CustomerManager;
import day3homework1.business.MilitaryCreditManager;
import day3homework1.entities.Customer;
import day3homework1.entities.Person;

public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("haci");
		customer.setLastName("öztürk");
		customer.setCity("samsun");
		Customer customer2 = new Customer();
		customer2 = customer;
		customer2.setFirstName("Mavi");
		Customer person = new Person();
		// referans tip olduðundan dolayý extend eden ana baþlýða çekebilirsin
		// person.setNationalIdentity("sdada");
		// person.setFirstName("fk");
		CustomerManager customerManager = new CustomerManager(new Person(),new MilitaryCreditManager());
		customerManager.save();
		customerManager.delete();
		// System.out.println(customer.getFirstName());

	}

}
