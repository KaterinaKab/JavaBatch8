package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
		
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		char secondValue=grade[1];
		
		for (int i=0; i<grade.length; i++) {
			char valueFromArray=grade[i];
			System.out.println(valueFromArray);
		}

	}

}
