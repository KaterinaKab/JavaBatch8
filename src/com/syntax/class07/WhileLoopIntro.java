package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time = 15;

		if (time > 12) {
			System.out.println("good day");// CODE EXECUTES 1 TIME
		}

		System.out.println("_________________WHILE LOOP____________________");

		// while (time>12) {
		// System.out.println("good day"); //INFINITE LOOP
		// }

		while (time > 12) {
			System.out.println("good day"); // how many times? = 3
			time--;
		}

		// while (time > 12) {
		// System.out.println("good day"); // how many times? INFINITE LOOP
		// time++;
		// }

		// i want to print numbers from 1 to 50

		int num = 1;

		while (num < 51) {
			System.out.println(num);
			num++;
		}

		System.out.println("PRINTING NUMBERS 10 TO 30 ONLY EVEN____________");

		int e = 10;

		while (e < 31) {
			if (e % 2 == 0) {
				System.out.print(e + " ");
			}

			e++;
		}

		System.out.println("______ANOTHER WAY________");

		int d = 10;
		while (d <= 30) {
			System.out.print(d + " ");
			d += 2;
		}

		// from 100 to 1 odd numbers only
		System.out.println("______________________________________________________");
		int odd = 99;
		while (odd > 0) {
			System.out.print(odd + " ");
			odd -= 2;
		}

		System.out.println("_____ANOTHER WAY___________");

		int odd1 = 100;

		while (odd1 > 0) {
			if ((odd1 % 2) != 0) {
				System.out.print(odd1 + " ");
			}
			odd1--;
		}
	}

}
