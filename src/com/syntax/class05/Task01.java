package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int years;
		int salary;
		
		System.out.println("How many years have you worked?");
		years=input.nextInt();
		
		if (years>=5) {
			System.out.println("You are eligible for the bonus!");
			System.out.println("What is your salary?");
			salary=input.nextInt();
			if (salary>50000) {
			System.out.println("Your bonus=5000");
		
	}else {
		System.out.println("Your bonus=3000");
	}
		}else {
		System.out.println("Sorry, no bonus");
	}
		
	}
}
