package com.syntax.class16;

public class Methods {
    public static void main(String[] args) {
        System.out.println(addNumbers(10,20));//30 //ctr+p ti check the error
        System.out.println(addNumbers(40,20));
        System.out.println(addNumbers(10,80));
    }

    public static int addNumbers(int num1, int num2) {
        return num1+num2;
    }
}
