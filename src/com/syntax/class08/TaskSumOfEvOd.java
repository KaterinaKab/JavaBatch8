package com.syntax.class08;

public class TaskSumOfEvOd {

	public static void main(String[] args) {
		
		int sum=0; 
		int sum1=0; 
		
		for (int a=1; a<=50; a++) {
			if (a%2==0) {
				sum+=a;
			} else {
				sum1+=a;
			}
		
		}
		System.out.println(sum+sum1);
	}

}
