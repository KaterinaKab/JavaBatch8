package com.syntax.class16;

public class Task3 {
    // method if the given String a palindrome

    public  void isStringPalindrome (String string) {
        int i=0;
        int j=string.length()-1;
        while(i<j) {
            if (string.charAt(i)!=string.charAt(j)) {
                System.out.println("String is not palindrome");
                return; //if its true, no checking anymore
            }
            i++;
            j--;
        }
        System.out.println("String is palindrome");
    }


}
