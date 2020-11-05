package com.syntax.class17;

public class RecapTask3 {
    /*
    Create  class Student that will have a method getGrade.
    Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
     */

    char getGrade(int score){
        char grade;
       if (score>=90 && score<=100) {
           grade='A';
       }else if (score>=80 && score<90){
           grade='B';
       }else if (score>=70 && score<80){
           grade='C';
        }else if (score>=60 && score<70) {
           grade='D';
       }else if (score>0 && score<60){
           grade='F';
       } else {
           grade='0';
       }
       return grade;

        }

    public static void main(String[] args) {
        RecapTask3 recapTask3 = new RecapTask3();
        System.out.println(recapTask3.getGrade(90));
        System.out.println(recapTask3.getGrade(101));
        System.out.println(recapTask3.getGrade(40));
        System.out.println(recapTask3.getGrade(70));
        System.out.println(recapTask3.getGrade(-1));
    }


    }

