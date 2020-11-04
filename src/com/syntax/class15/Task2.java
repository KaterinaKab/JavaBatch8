package com.syntax.class15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Please enter any word");
        String word=scan.nextLine();
        if (!word.isEmpty()) {
            if (word.length()%2!=0 && word.length()>=3) {
                System.out.println(word.charAt(word.length()/2));
            }else {
                System.out.println("Please try again");
            }
        } else {
            System.out.println("no word");
        }
    }
}
