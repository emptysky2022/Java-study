package exam;

// 1번 문제
//class Printer {
//	int numOfPapers = 0;
//
//	public void print(int amount) {
//		numOfPapers -= amount;
//	}
//}

// 2번 문제
//class Printer {
//	private int numOfPapers = 0;
//
//	public Printer(int paper) {
//		numOfPapers = paper;
//	}
//
//	public void print(int amount) {
//		if (numOfPapers == 0)
//			System.out.println("용지가 없습니다.");
//		else if (numOfPapers < amount) {
//			System.out.println("모두 출력하려면 용지가 " + (amount - numOfPapers) + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
//			numOfPapers = 0;
//		} else {
//			System.out.println(amount + "장 출력했습니다. 현재 " + (numOfPapers - amount) + "장 남아있습니다.");
//			numOfPapers -= amount;
//		}
//	}
//}

//3번 문제
class Printer {
	private int numOfPapers;
	private boolean duplex;

	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}

	public void print(int amount) {
		if (numOfPapers == 0) {
			System.out.println("용지가 없습니다.");
			return;
		}
		if (getDuplex()) {
			if (amount % 2 != 0)
				amount++;
			if (numOfPapers < amount / 2) {
				System.out.println(
						"양면으로 모두 출력하려면 용지가 " + (amount / 2 - numOfPapers) + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
				numOfPapers = 0;
			} else {
				System.out.println("양면으로 " + amount / 2 + "장 출력했습니다. 현재 " + (numOfPapers - amount / 2) + "장 남아있습니다.");
				numOfPapers -= amount / 2;
			}
		} else {
			if (numOfPapers < amount) {
				System.out.println(
						"단면으로 모두 출력하려면 용지가 " + (amount - numOfPapers) + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
				numOfPapers = 0;
			} else {
				System.out.println("단면으로 " + amount + "장 출력했습니다. 현재 " + (numOfPapers - amount) + "장 남아있습니다.");
				numOfPapers -= amount;
			}
		}

	}

	public boolean getDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}