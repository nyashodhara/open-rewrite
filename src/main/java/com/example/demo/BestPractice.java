package com.example.demo;

public class BestPractice {
    //adds braces if necessary

    public void process(boolean condition) {
        if (condition)
            System.out.println("Condition is true");
        else
            System.out.println("Condition is false");

        for (int i = 0; i < 5; i++)
            System.out.println("Index: " + i);

        //removes redundant catch clause
        try {
            System.out.println(10/2);
        } catch (Exception e) {
            throw e; // This is redundant if no additional handling is done
        }

        //to avoid null-pointer exception
        String str = null;
        if (str.equals("value")) {
            // Do something
        }

       //mask credit-card number
        String cardNumber = "4111 1111 1111 1111";
        System.out.println("Processing payment for card: " + cardNumber);
    }
}
