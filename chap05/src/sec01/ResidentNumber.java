package sec01;

public class ResidentNumber {
	String front, back;

	public ResidentNumber(String str) {
		front = str.substring(0, 6);
		back = str.substring(7, 14);
	}

	public void ResidentNumberParsing() {
		System.out.println("주민번호 앞자리는 " + front + "이고, 뒷자리는 " + back + "입니다.");
	}
}
