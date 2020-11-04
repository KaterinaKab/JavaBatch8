package com.syntax.class15;

public class SubString {
    public static void main(String[] args) {
        String name="yes always";
        System.out.println(name.substring(5)); //lways
        System.out.println(name.substring(0)); //yes always
        System.out.println(name.substring(1)); //es always
        System.out.println(name.substring(3,7)); // alw
        System.out.println(name.substring(3,7)+name.substring(7,10)); // always



    }
}


