package com.syntax.class09;

public class NestedLoopDemo {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) { // outer loop
			System.out.println("Hello");
			for (int y = 0; y < 3; y++) { // inner loop
				System.out.println("Bye");
			}
			System.out.println("______________________________________");
		}

		System.out.println("____________MORE______________");

		for (int i = 10; i < 14; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.println("i =" + i + " j=" + j);
			}
			System.out.println();
		}

		System.out.println("--------------hoe can i print numbers from 10 to 99 using nested loop------------------");

		for (int i = 1; i <= 9; i++) {
			for (int a = 0; a <= 9; a++) {
				System.out.println(i + "" + a);
			}
		}

		System.out.println("------------------how can i print clock-----------------");

		for (int h = 0; h <= 24; h++) {
			for (int m = 0; m < 60; m++) {
				if (h < 10) {
					if (m < 10) {
						System.out.println("0" + h + ":0" + m);
					} else {
						System.out.println("0" + h + ":" + m);
					}

				} else {
					System.out.println(h + ":" + m);
				}

			}
		}
		
		System.out.println("---------------how can i print car odometer----------------");
		
		for (int i=0; i<=99; i++) {
			for (int j=0; j<10; j++) {
				for (int c=0; c<10; c++) {
					for (int d=0; d<10; d++) {
						for (int g=0; g<10; g++) {
							System.out.println(i+""+j+""+c+""+d+""+g);
						}
					}
				}
				
			}
			
		}
	}

}
