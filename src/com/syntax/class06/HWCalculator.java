package com.syntax.class06;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
 
	 double num1, num2;
	 char operator; 
	 double result=0;
	 
	 System.out.println("Please enter the 1st number");
	 num1=scan.nextDouble();
	 System.out.println("Please enter the operacor (+;-;*;/)");
	 operator=scan.next().charAt(0);
	 System.out.println("Please enter the 2nd number");
	 num2=scan.nextDouble();
	 
	 
	 switch (operator) {
	 
	 case '+':
		 result=num1+num2;
		 break;
	 case '-':
		 result=num1-num2;
		 break;
	 case '*':
	     result=num1*num2;
	     break;
	 case '/':
		 result=num1/num2;
		 break;
	 default:
		 System.out.println("Please enter valid operator");
	 }
	  System.out.println("The result = "+result);
	}

}
