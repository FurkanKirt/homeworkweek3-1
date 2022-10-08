package day3homework1.business;

public class CreditManager implements CreditService {

	@Override
	public void calculate() {
		System.out.println("kredi hesaplandý");

	}

	@Override
	public void save() {
		System.out.println("kredi kaydedildi");

	}

}
