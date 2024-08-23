package com.example.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

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
            System.out.println("Value is true");
        }

       //mask credit-card number
        String cardNumber = "4111 1111 1111 1111";
        System.out.println("Processing payment for card: " + cardNumber);

        //post increment
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; ) {
            System.out.println(i);
            i++;
        }

        //equal condition
        String a = "hello";
        String b = "hello";
        if (a == b) {
            System.out.println("equal");
        }
    }
}
