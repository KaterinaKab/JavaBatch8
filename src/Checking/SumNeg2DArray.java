package Checking;

import java.util.Scanner;

public class SumNeg2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };

		int sum = 0;
		//for (int[] b : a) {
			//for (int c : b) {
			//sum += c;
		//}
		//}

		//System.out.print(sum);
		System.out.println("--------------Another Way--------------");
		

	  		for (int i = 0; i < a.length; i++) {
	  			for (int j = 0; j < a[i].length; j++) {
	  				sum = sum + a[i][j];
	  
	  			}
	  		}
	  		System.out.println(sum);

	}

}
