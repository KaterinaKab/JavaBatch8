package com.syntax.class17;

public class RecapTask1 {
    /*
    Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */

    String  createEmail(String userName, String lastName, String email) {
        return userName+lastName+"@"+email;
    }

}
