package sec04;

import sec03.Computer;
import sec03.Controllable;
import sec03.Notebook;
import sec03.TV;

public class ControllableDemo {
	public static void main(String[] args) {

		Controllable[] controllables = { new TV(), new Computer(), new Notebook() };

		for (Controllable c : controllables) {
			controll(c);
		}
		Controllable.reset();
	}

	public static void controll(Controllable c) {
		c.turnOn();
		c.turnOff();
		c.repair();
		System.out.println();
	}
}
