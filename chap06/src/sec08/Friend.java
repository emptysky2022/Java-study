package sec08;

public class Friend {
	String name;
	String phone;

	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
	}
}
