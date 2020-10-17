package com.syntax.class05;

public class IfWithNoBraces {

	public static void main(String[] args) {

		boolean isSaturday = false;

		if (isSaturday)
			System.out.println("Today is a Java class");// if no braces only 1 line will be treated as code for if block
		
		
		System.out.println("Tomorrow i will have a Java class");// this code doesn't belong to the if statement (bc no braces)

		System.out.println("I am a code outside of if statement");

	}

}
