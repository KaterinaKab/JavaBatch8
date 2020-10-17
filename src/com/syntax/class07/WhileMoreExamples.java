package com.syntax.class07;

public class WhileMoreExamples {

	public static void main(String[] args) {
		
		String day="Saturday";
		
		if (day.equals("Saturday")) {
			System.out.println("My fav Java Class!");
		}
		
//		while (day.equals("Saturday")) {
//			System.out.println("My fav Java Class!");// infinite
//		}
		
		System.out.println("_________________________________");
		
		boolean isItBreakTime=true;
		
		if (isItBreakTime) {
			System.out.println("I will get tea"); // 1
		}
		
		while (isItBreakTime) {
			System.out.println("I will get tea"); // infinite
			isItBreakTime=false;
		}
	}

}
