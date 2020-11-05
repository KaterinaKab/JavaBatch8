package com.syntax.class17;

public class Student {

    String name; //instant variables
    int age;
    double marks;
    static int numberOfStudents; //static variable


    public void printInfo() {
        System.out.println("Name: "+name+" Age: "+age+" Marks: "+marks);
    }
    public void StusentsRegistered(){
        System.out.println("Total number of students up till now "+numberOfStudents);
    }
}
