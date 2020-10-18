package com.syntax.class08;

public class TaskOdd {

	public static void main(String[] args) {

		System.out.println("----------------1 way-----------------");

		int num = 21;

		while (num <= 50) {
			System.out.print(num + " ");
			num += 2;
		}
		System.out.println(" ");
		System.out.println("----------------2 way-----------------");

		for (int i = 21; i <= 50; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println(" ");
		System.out.println("----------------3 way-----------------");

		for (int a = 20; a <= 50; a++) {
			if (a % 2 != 0) {
				System.out.print(a + " ");
			}
		}
	}

}
