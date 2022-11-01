package sec02;

import java.util.HashSet;
import java.util.Set;

public class HashSet2Demo {
	public static void main(String[] args) {
		Set<Fruit> fruits = new HashSet<>();
		fruits.add(new Fruit("사과"));
		fruits.add(new Fruit("사과"));
		System.out.println(fruits.size());
		System.out.println(fruits);

	}
}

class Fruit {
	@Override
	public String toString() {
		return "Fruit(" + name + ")";
	}

	private String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Fruit)
			return ((Fruit) obj).name.equals(name);
		return false;
	}

}
