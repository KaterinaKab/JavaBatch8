package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double commission=0;
		
		System.out.println("How much did you sale?");
		double sales=input.nextInt();
		
		if (sales>10 && sales<100) {
			commission=sales*0.1;
		}else if (sales>100 && sales<200) {
			commission=sales*0.2;
		}else if (sales>200 && sales<500) {
			commission=sales*0.3;
		}else if (sales>500) {
			commission=sales*0.5;
		}
		
		System.out.println("Your commission is "+commission);
		
			
		
		

	}

}
