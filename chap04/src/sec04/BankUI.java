package sec04;

public class BankUI implements BankUIInterface {
	public final String[] firstSelect = { "1. 일반업무", "2. 기업업무", "3. 개인업무", "0. 종료하기" };
	public final String[] generalAffairs = { "1. 입금", "2. 출금", "3. 잔고확인", "4. 기타" };

	private void menuCreateUp() {
		System.out.print("┌───────────────┐    ");
	}

	private void menuCreateCenter(String menu) {

		for (int i = 0; i < (15 - menu.length()) / 2; i++) {
			System.out.print(" ");
		}
		System.out.printf("%s", menu);
		for (int i = 0; i < 15 - menu.length(); i++) {
			System.out.print(" ");
		}
	}

	private void menuCreateDown() {
		System.out.print("└───────────────┘    ");
	}

	public void menuCreate(String[] menu) {
		for (String str : menu)
			menuCreateUp();
		System.out.println();
		for (String str : menu)
			menuCreateCenter(str);
		System.out.println();
		for (String str : menu)
			menuCreateDown();
		System.out.println();
	}

	public void useBank() {
		System.out.println(bankName);
	}

}
