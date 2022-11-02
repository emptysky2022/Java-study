package sec03;

import java.util.HashSet;

public class HowHashCode {
	public static void main(String[] args) {
		HashSet<Car> cset = new HashSet<>();
		cset.add(new Car("그렌저", "빨간색"));
		cset.add(new Car("그렌저", "빨간색")); // 중복이므로 hashCode와 equals 메서드를 거쳐 추가하지 않음
		cset.add(new Car("제네시스", "파란색"));
		cset.add(new Car("쏘나타", "하얀색"));
		cset.add(new Car("그렌저", "검정색"));
		cset.add(new Car("그렌저", "하얀색"));
		cset.add(new Car("아반테", "빨간색"));
		System.out.println("인스턴스의 수 : " + cset.size());

		for (Car c : cset)
			System.out.println(c);
	}
}
