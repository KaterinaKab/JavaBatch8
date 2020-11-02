package javaclass15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Mom's first name?");
        String name1=scan.nextLine();
        System.out.println("Dad's first name?");
        String name2=scan.nextLine();
        System.out.println("Boy or girl?");
        String kid=scan.nextLine();
        String mes="Suggestted baby name: ";

        if (kid.equalsIgnoreCase("boy")){
            String firstpart=name2.substring(0, name2.length()/2);
            String secondpart=name1.substring(name1.length()/2);
            kid=firstpart+secondpart;
        } else {
            String firstpart=name1.substring(0, name1.length()/2);
            String secondpart=name2.substring(name2.length()/2);
            kid=firstpart+secondpart;
        }

        System.out.println(mes+kid);
    }
}
