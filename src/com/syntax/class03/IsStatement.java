package com.syntax.class03;

public class IsStatement {

	public static void main(String[] args) {
		
		int num1=180;
		 int num2=900;
		 
		 System.out.println("writing my first if statement");
		 
		  if(num1>num2) {
			  System.out.println("num1 is bigger than num2");
			 
		  }
		 
		  
		  System.out.println("End of if statement");
		  
		  System.out.println("_________________________");

		  int temp=60;
		  if(temp>80) {
			  System.out.println("I'm goint to the beach");
		  } else {
			  System.out.println("I will go for a walk");
		  }
		  
		  System.out.println("_________________________");
		  
		  double expectedHours=15;
		  double actualHours=20;
		  
		  if(actualHours>expectedHours) { //true
			  System.out.println("You will love the course and you will get a job");
		  }else { //false
			  System.out.println("Cours will be too hard for you");
		  }
	}

}
