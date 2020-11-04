package com.syntax.class15;

public class Replace {
    public static void main(String[] args) {
        String Str=new String("Welcome on Board");

        System.out.println(Str.replace('o','T')); //WelcTme Tn BTard
        System.out.println(Str.replace('a','D')); //Welcome on BoDrd

        String mix="3213Hello 89 World354545 *&***^&*^&*";
        System.out.println(mix.replaceAll("[0-9]", ""));
        System.out.println(mix.replaceAll("[a-z]", ""));
        System.out.println(mix.replaceAll("[a-z A-Z]", ""));
        System.out.println(mix.replaceAll("[^A-Za-z0-9]", "")); //removing
    }
}
