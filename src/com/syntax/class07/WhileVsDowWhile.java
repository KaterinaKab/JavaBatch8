package com.syntax.class07;

public class WhileVsDowWhile {

	public static void main(String[] args) {
		
		int a=10;
		//first we check condition
		while (a<15) {
			System.out.println("Hello");
			a++;
		}
		
		int b=10;
		//first do smth
		do {
			System.out.println("Hi");
			b++;
		} while (b<15);//then check the condition

	}

}
