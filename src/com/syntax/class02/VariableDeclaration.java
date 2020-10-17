package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		// 1 way to create a variable

		// creat variable = assinning value
		// declare a variable=initializzing
		double $num = 12.99; //... =value

		// 2 way to create a variable:
		// declare a variable
		// initialize or assing value
		
		int myBox; // declaration (happens only once)
		myBox = 135; // assigning value 
		System.out.println(myBox);
		
		myBox = 155; //reassigning value
		System.out.println(myBox);
		
		//3 way
		int num1, num2, num3; //if variable is of same type, we can declare all in 1 line
		num1=10;
		num2=20;
		num3=30;
		
		System.out.println(num3);
		
		char char1='C';
		char char2='d';
		char char3=char1;
		System.out.println(char3); //C
		

	}

}
