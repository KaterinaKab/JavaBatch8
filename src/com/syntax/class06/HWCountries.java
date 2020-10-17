package com.syntax.class06;

import java.util.Scanner;

public class HWCountries {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String country;
		String language;
		 
		System.out.println("What country are you from?");
		country=input.next();
		
		switch (country.toLowerCase()) {
		
		case "russia":
			language="You speak Russian";
			break;
		case "america":
			language="You speak English";
			break;
		case "china":
			language="You speak Chinese";
			break;
		case "spain":
			language="You speak Spanish";
				break;
			default:
				language="Please enter another country";

		}
			
			System.out.println(language);

	}

}
