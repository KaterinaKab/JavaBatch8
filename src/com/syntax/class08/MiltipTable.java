package com.syntax.class08;

import java.util.Scanner;

public class MiltipTable {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		
		int mult;
		
		for (int i=1; i<=10; i++) {
			mult=num*i;
			System.out.println(num+" x "+i+" = "+mult);
		}
		
	}

}
