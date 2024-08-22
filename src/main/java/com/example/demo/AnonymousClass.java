package com.example.demo;

import java.util.List;
import java.util.function.Consumer;

public class AnonymousClass {
    //converts anonymous class to lambda expression

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Running");
        }
    };

    //anonymous inner class to lambda expression

    public void printList(List<String> list) {
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
