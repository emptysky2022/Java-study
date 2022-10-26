package sec03.bound;

import sec03.Beer;
import sec03.Beverage;
import sec03.Boricha;

public class BoundedTypeDemo {
	public static void main(String[] args) {
		Cup<Beverage> cup = new Cup<>();
		cup.setBeverage(new Beverage());
		cup.setBeverage(new Beer());
		cup.setBeverage(new Boricha());
//		cup.setBeverage("String");
	}
}

class Cup<T extends Beverage> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}