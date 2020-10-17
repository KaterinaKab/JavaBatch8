package com.syntax.class07;

public class workDay {

	public static void main(String[] args) {
		
		boolean workDay=true;
		int day=1;
		
		while (workDay && day<=5) {
			System.out.println("I need a day off");
			day++;
		}
		System.out.println("I do need a day off any more");
		 
	}

}
