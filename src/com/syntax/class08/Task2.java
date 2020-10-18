package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		String answer;
		
		do {
			System.out.println("Do you want to apply for a credit card?");
			answer=scan.next();
		}  while (!answer.equalsIgnoreCase("yes")) ;
		System.out.println("This is your card");

	}

}
