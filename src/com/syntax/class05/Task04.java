package com.syntax.class05;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int quiz, mid, finalScore, avg;

		System.out.println("Please enter your quiz score");
		quiz = scan.nextInt();

		System.out.println("Please enter your mid term score");
		mid = scan.nextInt();

		System.out.println("Please enter your final score");
		finalScore = scan.nextInt();

		avg = (quiz + mid + finalScore) / 3;
		System.out.println(avg);

		if (avg >= 90) {
			System.out.println("Grade A");

		} else if (avg >= 70 && avg < 90) {
			System.out.println("Grade B");
		} else if (avg >= 50 && avg < 70) {
			System.out.println("Grade C");
		} else if (avg < 50) {
			System.out.println("Grade F");
		}

		// if your grade is A or B --> you are a good student

	}

}
