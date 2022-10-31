package sec02;

import java.util.ArrayList;
import java.util.List;

public class CarDemo {
	public static void main(String[] args) {
		List<Car> dieselCars = findCars(Car.cars, c -> !c.isGasoline());
		System.out.println("디젤 자동차 = " + dieselCars);

		List<Car> oldCars = findCars(Car.cars, c -> c.getAge() >= 10);
		System.out.println("10년보다 오래된 자동차 = " + oldCars);

		List<Car> oldDieselCars = findCars(Car.cars, c -> c.getAge() > 10 && !c.isGasoline());
		System.out.println("10년보다 오래된 디젤 자동차 = " + oldDieselCars);

		System.out.println("\n디젤 자동차 리스트");
		printCars(dieselCars, c -> System.out.println("모델 : " + c.getModel() + ", 연식 : " + c.getAge()));

		System.out.println("\n10년보다 오래된 자동차 리스트");
		printCars(oldCars, c -> System.out
				.println("모델 : " + c.getModel() + ", 연식 : " + c.getAge() + ", 주행거리 : " + c.getMileage()));
	}

	public static List<Car> findCars(List<Car> all, CarPredicate p) {
		List<Car> result = new ArrayList<Car>();
		for (Car car : all) {
			if (p.test(car))
				result.add(car);
		}
		return result;
	}

	public static void printCars(List<Car> all, CarConsumer c) {
		for (Car car : all) {
			c.accept(car);
		}
	}
}
