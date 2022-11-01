package exam.SYJo_ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Person {
	private String name;
	private int height;
	private int weight;

	public Person(String name, int height, int age) {
		super();
		this.name = name;
		this.height = height;
		this.weight = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int age) {
		this.weight = age;
	}

	static ArrayList<Person> persons = new ArrayList<>(
			Arrays.asList(new Person("황진이", 160, 45), new Person("이순신", 180, 80), new Person("김삿갓", 175, 65),
					new Person("홍길동", 170, 68), new Person("배장화", 155, 48)));

}

public class PersonTest {
	static double average(List<Person> persons, Function<Person, Integer> func) {
		double sum = 0;
		for (Person p : persons)
			sum += func.apply(p);
		return sum / persons.size();
	}

	public static void main(String[] args) {
		Function<Person, Integer> heightAvg = x -> x.getHeight();
		Function<Person, Integer> weightAvg = x -> x.getWeight();
		System.out.println("평균 신장 : " + average(Person.persons, heightAvg));
		System.out.println("평균 체중 : " + average(Person.persons, weightAvg));
	}
}
