package com.practice.functional;

import java.util.function.Function;
//takes input and returns output
public class FunctionFI {
    public static void main(String[] args) {
        Function<String,Integer> f=(s)->s.length();
        System.out.println(f.apply("Pujitha"));
    }
}

