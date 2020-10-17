package com.syntax.class06;

import java.util.Scanner;

public abstract class Task {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have sale today?");
		boolean sale = input.nextBoolean();

		double price;
		double discount;
		double finalPrice;

		if (!sale) {
			System.out.println("No shopping");
		} else {
			System.out.println("We go for shopping");
			System.out.println("What is the price?");
		
		price = input.nextDouble();
		if (price >= 10 && price < 50) {
			discount = price * 0.1;
		} else if (price > 50 && price < 100) {
			discount = price * 0.2;
		} else if (price > 100 && price < 500) {
			discount = price * 0.4;
		} else if (price > 500) {
			discount = price * 0.5;
		}else {
			discount=0;
		}
		
		finalPrice = price - discount;
		System.out.println("Your discount is " + discount+". The final price is "+finalPrice);
	
	}
	}
}
