package sec04;

public class BankAccountDemo {
	public static void main(String[] args) {
		BankAccount kim = new BankAccount();

		kim.deposit(50000);
		kim.withdraw(10000);
		kim.checkMyBalance();

		BankAccount lee = new BankAccount();

		lee.deposit(10000);
		lee.withdraw(2000);
		lee.withdraw(5000);
		lee.checkMyBalance();

	}
}
