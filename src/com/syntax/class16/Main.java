package com.syntax.class16;

public class Main {
    public static void main(String[] args) {

        VoidMethods voidMethods = new VoidMethods();
        voidMethods.print("Aladin");


        //Task1
        Task1.printLarger(10,20);
        Task1.printLarger(10,5);
        Task1.printLarger(10,10);

        //Task2
        Task2 task2 = new Task2();
        task2.printNumberEvenOrOdd(5);
        task2.printNumberEvenOrOdd(4);
        task2.printNumberEvenOrOdd(0);

        //Task3
        Task3 task3 = new Task3();
        task3.isStringPalindrome("aba");
        task3.isStringPalindrome("abcd");

        //Task4
        Task4.sayHello("USA");
        Task4.sayHello("China");


    }
}
