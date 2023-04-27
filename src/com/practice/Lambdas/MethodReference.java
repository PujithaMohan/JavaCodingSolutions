package com.practice.Lambdas;

import java.util.function.Function;

public class MethodReference {
    public static int add(int a,int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Function<Integer,Double> b= Math::sqrt;
        System.out.println(b.apply(10));

        //method reference to an instance method of an object
        MethodReference m=new MethodReference();
        Addition a=MethodReference::add;
        System.out.println(a.additions(10,20));

    }
}
interface Addition{
    int additions(int x,int y);
}