package com.syntax.class08;

public class TaskEven {

	public static void main(String[] args) {

		System.out.println("----------------1 way-----------------");

		int num = 20;

		while (num >= 1) {
			System.out.print(num + " ");
			num -= 2;
		}
		System.out.println(" ");
		System.out.println("----------------2 way-----------------");

		for (int i = 20; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}

		System.out.println(" ");
		System.out.println("----------------3 way-----------------");

		for (int i = 20; i > 1; i--) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
