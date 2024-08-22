package com.example.demo;

public class PatternMatching {
    //Uses instanceof for type checking and casting

    Object obj = "hello";
    public void test(){
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.toUpperCase());
        }
    }
}
