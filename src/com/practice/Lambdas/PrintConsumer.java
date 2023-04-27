package com.practice.Lambdas;

import java.util.function.Consumer;

public class PrintConsumer {
    public static void main(String[] args) {
        Consumer<String> c=(String s)->{
            System.out.println(s.length());
        };//Takes an argument and returns nothing:Consumer
        c.accept("Sai Kiran");
    }
}
