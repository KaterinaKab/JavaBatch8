package com.syntax.class08;

import java.util.Scanner;

public class RecapWithDoWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int money;
		int price = 5;

		input = new Scanner(System.in);
		System.out.println("Please pay for your water");

		do {
			money = input.nextInt();

			if (money > price) {
				System.out.println("This is too much, you need to enter less money");

			} else if (money < price) {
				System.out.println("Water is expensive, please insert more money");

			}
			// money = input.nextInt();

		} while (money != price);
		System.out.println("Enjoy your water");

	}

}
