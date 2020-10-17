package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		/*
		 * variable for allergy: yes or no
		 * 
		 * if allergy is yes --> we will check if pet allergy if peanut allergy if
		 * pollen allergy if no allergy you are lucky!!
		 */

		boolean allergy = true;

		boolean petAllergy = false;
		boolean peanutAllergy = true;
		boolean pollenAllegry = false;

		if (allergy) { // true
			System.out.println("Let's do further check");

			if (petAllergy) {
				System.out.println("Please no home pet");
			} else {
				System.out.println("That is good you do not have pet allergy");
			}

		} else {
			System.out.println("You are lucky!!!");
		}

		System.out.println("________________EXAMPLE 2_____________________________");

		/*
		 * if today is Friday we will watch a movie but would like to check the day
		 * 
		 * if date is 13-->watching scary movie and if it is not --> i will watch comedy
		 * 
		 * if no Friday --> I am studying
		 */

		boolean isFriday = false;
		int date = 11;
		boolean Monday = true;

		if (isFriday) {
			if (date == 13) {
				System.out.println("I will watch a scary movie");
			} else {
				System.out.println("I will watch a comedy");
			}

		} else {
			if (Monday) {
				System.out.println("I will have a rest");
			} else {
				System.out.println("I have a class at Syntax");
			}
		}

		System.out.println("________________EXAMPLE 3_____________________________");

		/*
		 * check is assignment is completed if assignment is completed: if score>90 -->
		 * great job if score>80 --> good job if score>70 --> please study more
		 * 
		 * 
		 */

		boolean assignment = false;
		int score = 55;

		if (assignment) {
			if (score > 90) {
				System.out.println("Great job!");

			} else if (score > 80) {
				System.out.println("Good job.");
			} else if (score > 70) {
				System.out.println("Please study more");
			} else {
				System.out.println("Thank you for trying, but you must study!");
			}

		} else {
			System.out.println("You should always complete all assignments");
		}

	}

}
