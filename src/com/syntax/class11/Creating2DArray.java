package com.syntax.class11;

public class Creating2DArray {

	public static void main(String[] args) {
		
		// create an 2D array of food:
		//1-american
		//2-italian
		//3-asian
		//4-afghanian
		//5-indian
		
		String[][] food= {
				
				{"steak","hot-dog", "cheesburger"},
				{"pizza", "pasta", "canoli"},
				{"sushi", "ramen", "fried rice", "dumplings"},
				{"kebab", "manto"},
				{"beriyani", "masala", "curry", "chicken tikka masala"}
				
		};
		
		for (String[] dishes:food) {
			for (String dish:dishes) {
				System.out.print(dish+"   ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		
		for (int i=0; i<food.length; i++) {
			for (int j=0; j<food[i].length; j++) {
				System.out.println(food[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
