package com.syntax.class05;

import java.util.Scanner;

public class NestedIfLargeNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double num1, num2, num3;
		double largeNum=0;

		System.out.println("Please enter 3 numbers");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();

		if (num1 >= num2) { //if num1 > than num2
			if (num1 > num3) {
				largeNum = num1;
		  } else {
				largeNum = num3;
			}
		} else { // if number 2 larger than number
			if (num2 >= num3) {
				largeNum = num2;
			} else {
				largeNum = num3;
			}
		}
		System.out.println("The largest number is " + largeNum);
	}

}
