package com.syntax.class06;

import java.util.Scanner;

public class SwithStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a day number");
		int day = scan.nextInt();

		if (day == 1) {
			System.out.println("Today is Monday we have no class");
		} else if (day == 2) {
			System.out.println("Today is Tuesday, we have Manual class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday, we have Manual class");
		} else if (day == 4) {
			System.out.println("Today is Thursday, we have Review class");
		} else if (day == 5) {
			System.out.println("Today is Friday, but the class is tomorrow");
		} else if (day == 6) {
			System.out.println("Today is Saturday, we have Java class");
		} else if (day == 7) {
			System.out.println("Today is Sunday, we have Java claqss again");
		} else {
			System.out.println("This is invalid day of the week");
		}

		System.out.println("__________________SAME EXAMPLE USING SWITCH______________");
		String today;

		switch (day) { // datatype of variable must match with datatype of cases

		case 1: // 1- is a type of int (day is int as well)
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:

			today = "Wednsday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
		default: // break --> is optional since it is he last statement in the switch
			today = "Invalid day";
			

		}
		System.out.println("Today is "+today);
	}

}
