package practice;

import java.util.Scanner;

public class CylinderVolume {
	public static void main(String[] args) {
		int radius, hei;
		float pi = 3.14f;
		Scanner in = new Scanner(System.in);

		System.out.print("원기둥의 밑면 반지름은? ");
		radius = in.nextInt();

		System.out.print("원기둥의 높이? ");
		hei = in.nextInt();

		System.out.println("원기둥의 부피는 " + pi * radius * radius * hei);

	}
}
