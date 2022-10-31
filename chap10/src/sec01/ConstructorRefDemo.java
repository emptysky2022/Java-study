package sec01;

import java.util.Random;

interface NewObject<T> {
	T getObject(T o);
}

interface NewArray<T> {
	T[] getArray(int size);
}

interface Lotto<T> {
	T random(T random);
}

public class ConstructorRefDemo {
	public static void main(String[] args) {
		NewObject<String> s;
		NewArray<Integer> i;

		s = new NewObject<String>() {
			@Override
			public String getObject(String o) {
				return new String(o);
			}
		};
		s = o -> new String(o);
		s = String::new;
		System.out.println(s.getObject("Hello!"));

		i = new NewArray<Integer>() {
			@Override
			public Integer[] getArray(int size) {
				return new Integer[size];
			}
		};
		i = size -> new Integer[size];
		i = Integer[]::new;
		System.out.println(i.getArray(20).length);

		Random random = new Random();
		Lotto<Integer> num = random::nextInt;
		for (int a : i.getArray(6)) {
			a = num.random(45);
			System.out.println(a + 1);
		}
	}
}
