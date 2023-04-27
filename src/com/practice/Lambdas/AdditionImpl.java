package com.practice.Lambdas;
interface Add{
    int add(int a,int b);
}
public class AdditionImpl {
    public static void main(String[] args) {
        Add a=(c,b)->{
            return c+b;
        };
        System.out.println(a.add(5,6));
    }
}
