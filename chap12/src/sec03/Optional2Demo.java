package sec03;

import java.util.Optional;

import sec01.Util;

public class Optional2Demo {
	public static void main(String[] args) {
		String s1 = "안녕";
		Optional<String> o = Optional.ofNullable(s1);

		Util.print(s1 != null ? s1 : "없음");
		Util.print(o.isPresent() ? o.get() : "없음");

		String s2 = o.orElse("없음");
		Util.print(s2);

		o.ifPresentOrElse(Util::print, () -> System.out.println("없음"));
	}
}
