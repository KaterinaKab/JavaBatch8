package com.syntax.class08;

public class ContinueKerword {

	public static void main(String[] args) {
		
		//I want to print numbers from 1 to 5 except 3
		
		for (int i=1; i<=10; i++) {
			
			if (i==3 || i==7) {
				continue; // skip
			}
			System.out.println(i);
		}
		System.out.println("End of the loop");

	}

}
