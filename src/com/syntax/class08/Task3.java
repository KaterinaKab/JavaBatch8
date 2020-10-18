package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers: from _ to _");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		int sum1=0, sum2=0;
		
		for (int i=num1; i<=num2; i++) {
			if (i%2==0) {
				sum1+=i;
			}
			if (i%2!=0) {
				sum2+=i;
			}
		}
		System.out.println("The sum of even numbers is "+sum1);
		System.out.println("The sum of odd numbers is "+sum2);
		
	
		
	

	}

}
