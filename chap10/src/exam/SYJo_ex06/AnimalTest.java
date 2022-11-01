package exam.SYJo_ex06;

import java.util.function.Supplier;

class Animal {
	public void sound() {
		System.out.println("ㅁㅁㄲㄲ ...");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

public class AnimalTest {
	public static void soundAnimal(Supplier<Animal> s) {
		s.get().sound();
	}

	public static void main(String[] args) {
		Supplier<Animal> s1 = () -> new Animal();
		soundAnimal(s1);
		Supplier<Animal> s2 = () -> new Dog();
		soundAnimal(s2);
	}
}
