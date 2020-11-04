package com.syntax.class15;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Hello "); //mutable (can be changed)
        stringBuilder.append("world");
        System.out.println(stringBuilder);

        String string="Hello";
        string.concat("World");
        System.out.println(string); //Hello


    }

}
