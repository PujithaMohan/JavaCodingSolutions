package com.practice.functional;

import java.util.function.Consumer;
//takes input but returns nothing
public class ConsumerFI {
    public static void main(String[] args) {
        Consumer<Integer> c=(n)-> System.out.println(Math.pow(n,2));
        c.accept(5);
    }
}
