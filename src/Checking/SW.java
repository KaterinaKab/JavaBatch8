package Checking;

import java.util.Scanner;

public class SW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    String car;
	    String mes;
	    System.out.println("Please enter your favorite car make");
	    
	    switch (car) {
	      case "BMW":
	        mes="german car";
	        break;
	      case "Toyota":
	        mes="japanese car";
	        break;
	      case "Maserati":
	        mes="italian car";
	        break;
	      default:
	      mes="unknown";
	      
	    }
	    System.out.println("Your favorite car is "+mes);

	}

}
