package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/*
		 * lets ask a tester on which browser they would like to use
		 */
		
		
		Scanner scan;
		String browser;
		String message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter the browser");
		browser=scan.nextLine();
		
		switch (browser.toLowerCase()) { //convert letters into low case
		
		case "safari":
			message="Your code will be executed on safari browser";
			break;
		case "chrom":
			message="Your code will be executed on chrom browser";
			break;
		case "firefox":
			message="Your code will be executed on firefox browser";
			break;
		default:
			message="Entered browser is not supported";
		}
		
		System.out.println(message);
		
		// switch cannot work with double, float, long!!
		// switch cannot use relational or logical operators!!

	}

}
