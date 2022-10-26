package sec03;

import sec03.generic.Cup;

public class GenericClass2Demo {
	public static void main(String[] args) {
		Cup<Beer> c = new Cup<Beer>();
		Cup<Boricha> c1 = new Cup<>();

		c.setBeverage(new Beer());
		Beer b1 = c.getBeverage();

		c1.setBeverage(new Boricha());
		Boricha b2 = c1.getBeverage();
	}
}
