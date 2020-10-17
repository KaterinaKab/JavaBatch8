package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {

		String day = "Sunday";

		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Taday I have a class at Syntax");

		}
		System.out.println("The end");

		System.out.println("_____________________more examples________________________");
		
		/* if day 1 or 5 --> I am off from Syntax
		 * if day 2 or 3 --> GIT classes
		 * if day 4 --> Review class
		 * if day 6 or 7 --> Java classes
		 * everything else will be invalid
		 */

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter today day");
		int today=input.nextInt();
		
		if (today==1 || today==5) {
			System.out.println("I have day off from Syntax");
		}else if (today==3 || today==2) {
			System.out.println("I have GIT class");
		} else if (today==4) {
			System.out.println("Today is Review class");
		}else if (today==6 || today==7) {
			System.out.println("Today is Java class");
		}else {
			System.out.println("Please enter a valid day from 1 to 7");
		}
		
		
	}

}
