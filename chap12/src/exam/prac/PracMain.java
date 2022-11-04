package exam.prac;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracMain {
	static int[] age = { 25, 20, 29, 28, 32, 18 };

	enum Gender {
		남, 여
	}

	public static void main(String[] args) {
		List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
		List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
		List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);
		// 1-2
		Stream<String> s1 = names.stream();
		s1.filter(p -> p.charAt(0) < '이').forEach(p -> System.out.print(p + " "));
		System.out.println();
		// 1-3
		Stream<String> s2 = names.stream();
		s2.sorted().forEach(p -> System.out.print(p + " "));
		System.out.println();
		// 1.4
		Stream<String> s3 = names.stream();
		Optional<String> streamFirst = s3.findFirst();
		System.out.println(streamFirst + "\n" + streamFirst.get());
		// 1-5
		Stream<String> s4 = names.stream();
		long count = s4.count();
		System.out.println(count);

		// 2-3
		Stream<Integer> i1 = ages.stream();
		Optional<Integer> sum = i1.reduce(Integer::sum);
		System.out.println(sum.get());
		i1 = ages.stream();
		Optional<Integer> max = i1.max(Integer::compare);
		System.out.println(max.get());
		i1 = ages.stream();
		Double ave = i1.collect(Collectors.averagingDouble(x -> x.doubleValue()));
		System.out.println(ave.doubleValue());
		// 3-2
		Stream<String> nameStream = names.stream();
		Stream<Member> member = nameStream.map(n -> new Member(n, null, 0));

	}
}
