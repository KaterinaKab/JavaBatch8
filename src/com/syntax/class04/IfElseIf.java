package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {

		/*
		 * we need to compae 2 numbers; bigger, smaller or equal
		 * 
		 */
		
		int num1=9;
		int num2=99;
		
		if (num1>num2) { //what if this condition is true
			System.out.println(num1+" is bigger than "+num2);
		}else if (num1<num2) { // or what if this is rue
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
		
		System.out.println("__________________________________________");
		
		/* Based on the day of the week, we will print class schedule
		 * 
		 */
		
		int day=3;
		
		if (day==1) {
			System.out.println("Today is Monday we have no class");
			} else if (day==2) {
				System.out.println("Today is Tuesday, we have Manual class");
			}else if (day==3) {
				System.out.println("Today is Wednesday, we have Manual class");
			}else if (day==4) {
				System.out.println("Today is Thursday, we have Review class");
			}else if (day==5 ) {
				System.out.println("Today is Friday, but the class is tomorrow");
			}else if (day==6) {
				System.out.println("Today is Saturday, we have Java class");
			}else if (day==7 ) {
				System.out.println("Today is Sunday, we have Java claqss again");
			}else {
				System.out.println("This is invalid day of the week");
			}
	}

}
