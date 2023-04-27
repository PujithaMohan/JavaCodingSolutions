package com.practice.Lambdas;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class PrintDateSupplier {

    public static void main(String[] args) {
        Supplier<LocalDateTime> s=()->{
            return LocalDateTime.now();
        };//no input but returns output
        System.out.println(s.get());
    }
}
