package com.syntax.class10;

public class Tasks {

	public static void main(String[] args) {
		
		System.out.println("---------------------------1--------------------------");
		 char [] grade=new char[6];
		 grade[0]='A';
		 grade[1]='B';
		 grade[2]='C';
		 grade[3]='D';
		 grade[4]='E';
		 grade[5]='F';
		 System.out.println(grade[1]);
		 
		 char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		 System.out.println(grades[1]);
		 
		 System.out.println("---------------------------2---------------------------");
		 String[] name= new String[4];
		 name[0]="Vika";
		 name[1]="Polina";
		 name[2]="Sasha";
		 name[3]="Katya";
		 System.out.println(name[3]);
		 
		 String[] names= {"Katya", "Polina", "Sasha", "Vika"};
		 System.out.println(names[0]);
		 
		 System.out.println("-------------------------3------------------------------");
		 
		 String[] words= {"Java", "Saturday", "day", "coding", "is"};
		 System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		

	}

}
