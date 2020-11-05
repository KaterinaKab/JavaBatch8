package com.syntax.class17;

public class RecapTask2 {
    /*
    Write a method to return whether given number is prime or not?
    Prime number - divisible by itself and 1
     */

    boolean isPrime(int number) {

        if (number<=1){
            return false;
        }
        boolean isPrime=true;
        for(int i=2; i<number/2; i++) {
            if(number%i==0) {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }


}
