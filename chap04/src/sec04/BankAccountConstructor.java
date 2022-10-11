package sec04;

public class BankAccountConstructor {
	public static void main(String[] args) {
		BankAccount yoon = new BankAccount("44-55-66", "991203-0000000", 10000);
		BankAccount park = new BankAccount("33-44-55", "981111-0000000", 10000);

		yoon.deposit(3000);
		park.deposit(5000);

		yoon.withdraw(2000);
		park.withdraw(2000);

		yoon.checkMyBalance();
		park.checkMyBalance();

	}
}
