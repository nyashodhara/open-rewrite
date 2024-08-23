package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class ExplicitLambdaArgs {
    //explicitly define argument type

    public void test(){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name.toUpperCase()));
    }
}
