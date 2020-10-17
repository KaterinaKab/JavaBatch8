package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		/*
		 * I need to define whether number that is entered from user 
		 * small number is a
		 * number between 1 to 10 
		 * medium  11 to 100
		 * large 101 to 1000
		 */

		Scanner input = new Scanner(System.in);

		int number;

		System.out.println("Please enter the number");
		number = input.nextInt();

		if (number>0 && number<=10) {
			System.out.println("You entered small number");
			
		}else if (number>10 && number<=100) {
			System.out.println("You entered medium number");
		}else if (number>100 && number<1000) {
			System.out.println("You entered large number");
		}
	}

}
