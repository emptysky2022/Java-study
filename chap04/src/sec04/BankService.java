package sec04;

public class BankService {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		BankAccount yourAccount = new BankAccount();

		System.out.println("신규 계좌 신설 지급 1만원");
		myAccount.balance = 10000;
		yourAccount.balance = 10000;
		myAccount.checkMyBalance();
		yourAccount.checkMyBalance();

		System.out.println("오늘 점심 7000원 사용");
		myAccount.withdraw(7000);
		myAccount.checkMyBalance();
		System.out.println("너는 점심 10000원 사용");
		yourAccount.withdraw(10000);
		yourAccount.checkMyBalance();

//여기부터 기능 추가
		boolean useBankStop = true;
		BankAccount jo = new BankAccount("11-22-33", "001218-0000000", 10000);
		while (useBankStop) {
			useBankStop = jo.useBank();
		}
	}
}
