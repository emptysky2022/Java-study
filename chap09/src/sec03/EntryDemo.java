package sec03;

public class EntryDemo {
	public static void main(String[] args) {
		Entry<String, Integer> e1 = new Entry<String, Integer>("김선달", 20);
		Entry<String, String> e2 = new Entry<String, String>("기타", "등등");

		System.out.println(e1.getKey() + " " + e1.getValue());
		System.out.println(e2.getKey() + " " + e2.getValue());
	}
}
