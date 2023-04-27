package com.practice.Lambdas;

import java.util.function.Predicate;

public class EvenNumberPredicate {
    public static void main(String[] args) {
        Predicate<Integer> p=(n)->{
            if(n%2==0)
                return true;
            return false;
        };//takes an input and return boolean
        System.out.println(p.test(3));
    }
}
