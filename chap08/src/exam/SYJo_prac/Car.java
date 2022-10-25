package exam.SYJo_prac;

public class Car {
	private String model;

	public Car(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return model;
	}

	@Override
	public boolean equals(Object obj) {
		Car c = (Car) obj;
		if (this.model.equals(c.model))
			return true;
		else
			return false;
	}
}
