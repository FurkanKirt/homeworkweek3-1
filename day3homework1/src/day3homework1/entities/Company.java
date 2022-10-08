package day3homework1.entities;

public class Company extends Customer {
	private int taxNumber;

	public int getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(int taxNumber) {
		this.taxNumber = taxNumber;
	}

	public Company() {
		super();
	}

	public Company(int taxNumber) {
		super();
		this.taxNumber = taxNumber;
	}
}
