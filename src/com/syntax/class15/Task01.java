package com.syntax.class15;

public class Task01 {
    public static void main(String[] args) {
        String sen="Today is Saturday";
        System.out.println(sen);
        System.out.println(sen.replaceAll(" ", ""));


        System.out.println("----------------Task02-----------------");
        String var="Hey 17*6 nnn";
        System.out.println(var.replaceAll("[^0-9]","").length());

        System.out.println("-------------Task03------------");
        String var1="Is it Saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(var1.replaceAll("[\\sA-Za-z0-9]", "").length());

    }


}

