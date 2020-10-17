package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String answer;
		double balance;

		System.out.println("Please enter if you have a credit card (true/false)");

		answer = scan.next();

		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on your cart?");
			balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off your cart balance");
			} else {
				System.out.println("You can spend more money");
			}

		} else {
			System.out.println("Would you like to have a credit cart?");
		}

	}

}
