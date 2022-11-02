package exam.SYJo_ex06;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
	public static void main(String[] args) {
		Map<String, String> animal = new HashMap<>(Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion"));
		System.out.println("변경 전 : " + animal);

		animal.replaceAll((k, v) -> v.toUpperCase());
		System.out.println("변경 후 : " + animal);
	}
}
