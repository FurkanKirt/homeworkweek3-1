package day3homework1.business;

public class CreditManager implements CreditService {

	@Override
	public void calculate() {
		System.out.println("kredi hesapland�");

	}

	@Override
	public void save() {
		System.out.println("kredi kaydedildi");

	}

}
