package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class ForEachRemove {
    //replaces removeAll by foreach

    public void test(){
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        Set<String> elementsToRemove = new HashSet<>();
        elementsToRemove.add("b");
        elementsToRemove.add("c");
        set.removeAll(elementsToRemove);
        System.out.println(set); // Output: [a]

    }
}
