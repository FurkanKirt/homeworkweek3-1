package day3homework1.entities;

public class Person extends Customer {
	private String nationalIdentity;

	public Person(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public Person() {

	}
}
