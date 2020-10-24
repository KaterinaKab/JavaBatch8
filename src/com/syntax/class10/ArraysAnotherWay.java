package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		
		String [] names= {"Mike", "Burju", "Jack", "Danilo", "Bryan", "Evgeniya"};
		
		//String[] name;
		//name= {"Sabeen"}; we can not do it in 2 steps this way
		
		System.out.println(names[3]);
		
		//how do I know how many elements i have in the array?
		int size=names.length;
		System.out.println("Size of names array = "+size);
		
		System.out.println(names[names.length-2]); //Danilo
		
		int a=2;
		System.out.println(names[a]); //Jack
		
		a+=2;
		System.out.println(names[a]); //Bryan
		System.out.println("-------------------------------");
		
		for (int i=0; i<names.length; i++ ) { // or i<=names.length-1
			System.out.println(names[i]);
		}
	}

}
