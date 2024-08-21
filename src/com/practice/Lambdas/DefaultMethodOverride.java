package com.practice.Lambdas;

public class DefaultMethodOverride implements A,B{
    public static void main(String[] args) {
        DefaultMethodOverride defaultMethodOverride=new DefaultMethodOverride();
        defaultMethodOverride.print();
    }
    @Override
    public void print() {
       // A.super.print();
        System.out.println("Overridden");
    }
}

interface A{
    default void print(){
        System.out.println("Interface A");
    }
}
interface B{
    default void print(){
        System.out.println("Interface B");
    }
}