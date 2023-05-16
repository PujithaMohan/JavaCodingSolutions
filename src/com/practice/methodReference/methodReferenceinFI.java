package com.practice.methodReference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class methodReferenceinFI {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt=Math::sqrt;
        System.out.println(sqrt.apply(10));
        BiFunction<Integer,Integer,Integer> biFunction=add::addition;
        System.out.println(biFunction.apply(10,20));
    }
}
interface add{
    static int addition(int a, int b) {
        return a+b;
    }
}
interface Printable{
    void printMessage(String message);

}
