package com.practice.functional;

public class UserDefinedFunctionFI {
    public static void main(String[] args) {
        Function<String,String,String> f=(a,b,c)-> a.concat(b).concat(c);
        System.out.println(f.apply("Pujitha","Mohan","Kiran"));
    }
}
interface Function<A,B,C>{
    String apply (A a,B b,C c);
}