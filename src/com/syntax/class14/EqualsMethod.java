package com.syntax.class14;

public class EqualsMethod {
    public static void main(String[] args) {
        String name="Sabeen";
        String name2="Sabeen";
        String name3="Eduard";
        System.out.println(name.equals(name2)); //true
        System.out.println(name.equals(name3)); //false
        System.out.println(name2.equals(name3)); //false
        System.out.println("______________________");

        System.out.println(name==name2); //true
        System.out.println(name==name3); //false
        System.out.println(name2==name3); //false
        System.out.println("______________________");

        name= new String("Sabeen");
        name2=new String("Sabeen");
        name3=new String("Eduard");

        System.out.println(name.equals(name2)); //true
        System.out.println(name.equals(name3)); //false
        System.out.println(name2.equals(name3)); //false
        System.out.println("______________________");

        System.out.println(name==name2); //false
        System.out.println(name==name3); //false
        System.out.println(name2==name3); //false
        System.out.println("______________________");

    }
}
