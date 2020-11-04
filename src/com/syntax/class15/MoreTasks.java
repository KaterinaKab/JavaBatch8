package com.syntax.class15;

import java.util.Arrays;

public class MoreTasks {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("Anna");
        System.out.println(stringBuilder1.reverse());
        System.out.println("---------------------------------------------------");

        String sen="What did you use the most ?";
        String[] words = sen.split(" ");
        System.out.println(Arrays.toString(words));

        for (int i=0; i< words.length; i++) {
            StringBuilder stringBuilder=new StringBuilder(words[i]);
            words[i]=stringBuilder.reverse().toString();
        }
        System.out.println(Arrays.toString(words));
        System.out.println("---------------------------------------------------");




    }
}
