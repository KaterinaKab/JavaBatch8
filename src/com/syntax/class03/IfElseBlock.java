package com.syntax.class03;

public class IfElseBlock {
	public static void main(String[] args) {

		double money = 2;
		double iceCream = 5.59;

		if (money >= iceCream) {
			System.out.println("I am buying ice cream");
		} else {
			System.out.println("Sorry, no ice cream");
		}

		System.out.println("I am code that executes without any condition");
		
		System.out.println("__________________________________________________________________");
		
		boolean sleepy=false;
		 if(sleepy) {
			 System.out.println("I will take a nap");
		 } else {
			 System.out.println("I will study some Java");
		 }
		 System.out.println("__________________________________________________________");
		 
		 boolean hungry=false;
		 
		 if (hungry) {
			 System.out.println("I will go eat");
		 }else {
			 System.out.println("I will study");
		 }

	}

}
