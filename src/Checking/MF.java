package Checking;

import java.util.Scanner;

public class MF {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int age;
		
		System.out.println("Please enter your gender: F or M");
		char gender=input.next().charAt(0);
		
		if (gender=='F') {
			System.out.println("Enter your age");
			 age=input.nextInt();
			if (age>25) {
				System.out.println("Woman");
			}else {
				System.out.println("Girl");
			}
		
		}else if (gender=='M') {
			System.out.println("Enter your age");
			age=input.nextInt();
			if (age>25) {
				System.out.println("Man");
				
			}else {
				System.out.println("Boy");
			}
		}

	}

}
