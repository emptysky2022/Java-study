package exam.SYJo_ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonDemo {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 35));

		set.forEach(x -> System.out.println(x.name + " : " + x.age));

		Iterator<Person> itr = set.iterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
	}
}
