package exam;

class Car {
	static private int numOfCar = 0;
	static private int numOfRedCar = 0;
	String color;

	Car(String color) {
		this.color = color;
		if (color == "red" || color == "RED") {
			numOfRedCar++;
		}
		numOfCar++;
	}

	public static int getNumOfCar() {
		return numOfCar;
	}

	public static int getNumOfRedCar() {
		return numOfRedCar;
	}

}
