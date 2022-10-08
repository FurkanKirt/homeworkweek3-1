package day3homework1.business;

public abstract class BaseCreditService implements CreditService{
	@Override
	public abstract void calculate();

	@Override
	public void save() {
		System.out.println("kredi kaydedildi.");
		
	}
}
