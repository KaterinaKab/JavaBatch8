package com.syntax.class15;

public class Split {
    public static void main(String[] args) {
        String name="Burju Maria Qasim";
        String[] array =name.split(" ");
        for (String name1:array) {
            System.out.println(name1);
           //or (instead of for ( : ) System.out.println(Arrays.toString(array));
        }
    }
}
