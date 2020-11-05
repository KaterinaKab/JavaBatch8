package com.syntax.class17;

public class Main {
    public static void main(String[] args) {

        //Task1
        RecapTask1 recapTask1 = new RecapTask1();
        String email=recapTask1.createEmail("john", "snow", "gmail.com");
        System.out.println(email);


        //Task2
        RecapTask2 recapTask2 = new RecapTask2();
        System.out.println(recapTask2.isPrime(5));

        //Student

        Student quasim = new Student();
        quasim.name="Quasim";
        quasim.age=30;
        quasim.marks=90;
        Student.numberOfStudents++;
        quasim.StusentsRegistered();


       Student danilo = new Student();
       danilo.name="Danilo";
       danilo.age=30;
       danilo.marks=94;
       Student.numberOfStudents++;
       danilo.StusentsRegistered();





    }
}
