package sec04;

import java.util.Scanner;

public class BankAccount {
	int balance;
	String accNumber;
	String ssNumber;

	public BankAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}

	public BankAccount() {
		balance = 0;
	}

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		if (balance < 0) {
			balance += amount;
			System.out.println("잔액이 부족합니다.");
		}
		return balance;
	}

	public int checkMyBalance() {
		System.out.println("계좌번호 : " + accNumber);
		System.out.println("주민번호 : " + ssNumber);
		System.out.println("잔   액 : " + balance);
		return balance;
	}

// 여기부터 기능 추가

	BankUI ui = new BankUI();
	int menuCount;
	Scanner in = new Scanner(System.in);

	public BankAccount(int money) {
		balance = money;
	}

	public boolean useBank() {
		menuCount = 0;
		ui.useBank();
		int end = chooseMenu(-1);
		if (end == -1004) {
			return false;
		}
		return true;
	}

	private int chooseMenu(int n) {
		switch (n + menuCount) {
		case -1 -> {
			ui.menuCreate(ui.firstSelect);
			System.out.println("이용하실 업무의 번호를 입력하세요");
			return chooseMenu(in.nextInt());
		}
		case 0 -> {
			System.out.println("은행업무 프로그램을 종료합니다.");
			return -1004;
		}
		case 1 -> {
			ui.menuCreate(ui.generalAffairs);
			menuCount = 10;
			chooseMenu(in.nextInt());
		}
		case 2 -> {
			System.out.println("기업업무는 불가능합니다.");
		}
		case 3 -> {
			System.out.println("개인업무는 미구현입니다.");
		}
		case 11 -> {
			System.out.print("입금하실 금액을 입력하세요 : ");
			deposit(in.nextInt());
			checkMyBalance();
		}
		case 12 -> {
			System.out.print("출금하실 금액을 입력하세요 : ");
			withdraw(in.nextInt());
			checkMyBalance();
		}
		case 13 -> {
			checkMyBalance();
		}
		case 14 -> {
			System.out.print("기타 업무는 못해요 ><");
		}
		default -> System.out.println("오류가 발생했습니다.");
		}
		return 0;
	}
}
