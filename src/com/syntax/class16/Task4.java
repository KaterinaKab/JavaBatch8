package com.syntax.class16;

public class Task4 {

    //"Hello" in dif languages based on the countries

    static void sayHello(String countryName) {

        switch (countryName) {
            case "USA":
                System.out.println("Hello");
                break;
            case "China" :
                System.out.println("Ni Hoa");
                break;
            case "Turkey":
                System.out.println("Merhaba");
                break;
            default:
                System.out.println("Country not supported");



        }

    }
}
