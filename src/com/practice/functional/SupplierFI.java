package com.practice.functional;

import java.util.function.Supplier;
//takes no input but returns output
public class SupplierFI {
    public static void main(String[] args) {
        Supplier<String> s=()->
            "Pujitha".toUpperCase();
        System.out.println(s.get());
    }
}
