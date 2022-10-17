package sec08;

class Cake {
}

class CheeseCake extends Cake {
}

class StrawberryCheeseCake extends CheeseCake {
}

public class YummyCakeOf {
	public static void main(String[] args) {
		Cake cake = new StrawberryCheeseCake();

		if (cake instanceof Cake) {
			System.out.print("케익 인스턴스 or");
			System.out.println("케익을 상속하는 인스턴스");
		}
		if (cake instanceof CheeseCake) {
			System.out.print("치즈케익 인스턴스 or");
			System.out.println("치즈케익을 상속하는 인스턴스");
		}
		if (cake instanceof StrawberryCheeseCake) {
			System.out.print("딸기치즈케익 인스턴스 or");
			System.out.println("딸기치즈케익을 상속하는 인스턴스");
		}
	}
}
