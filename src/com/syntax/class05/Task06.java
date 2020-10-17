package com.syntax.class05;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String month;
		String season;

		System.out.println("What month were you born?");
		month = scan.next();

		if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		} else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		} else {
			System.out.println("Invalid month");
			season="invalid";
			
		}

		System.out.println("You were born in "+season);

	}

}
