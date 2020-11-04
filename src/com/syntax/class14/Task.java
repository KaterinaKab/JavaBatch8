package com.syntax.class14;

public class Task {
    public static void main(String[] args) {
        String userName="Syntax";
        String password="pas123";

        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("Username and password cannot be empty");
        }else if (password.length()<8) {
            System.out.println("Password is too short");
        } else if (password.contains(userName)) {
            System.out.println("Password cannot contain username");
        }else if (!password.equals(password)) {
            System.out.println("Password do not match");
        }else {
            System.out.println("Your username ad password has been created");
        }

    }
}
