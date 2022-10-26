package sec02;

import java.util.Scanner;

public class MyExceptionClass {
	public static void main(String[] args) {
		System.out.print("나이 입력 : ");
		try {
			int age = readAge();
		} catch (ReadAgeExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static int readAge() throws ReadAgeExeption {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 0 || age > 150)
			throw new ReadAgeExeption();
		return age;
	}
}
