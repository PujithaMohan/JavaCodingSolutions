package com.practice.Lambdas;

import java.util.function.Function;

public class FindLengthOfStringFunction {
    public static void main(String[] args) {
        Function<String,Integer> function=(String s)->{
            return s.length();
        };// takes input and returns result:Function
        System.out.println(function.apply("Pujitha"));
    }
}
