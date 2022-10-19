package sec04;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat(), new Cuckoo() };

		for (Animal a : animals)
			makeSound(a);
	}

	public static void makeSound(Animal a) {
		a.sound();
	}
}
