package sec03;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.setModel("갤럭시");
		myPhone.value = 120;
		myPhone.print();
		System.out.println(myPhone);

		Phone yourPhone = new Phone();
		yourPhone.setModel("아이폰");
		yourPhone.value = 160;
		yourPhone.print();
		System.out.println(yourPhone);

		myPhone = yourPhone;
		System.out.println(myPhone);
		myPhone.print();

	}
}
