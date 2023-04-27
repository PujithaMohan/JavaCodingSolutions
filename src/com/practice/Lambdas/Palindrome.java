package com.practice.Lambdas;

import java.util.function.Function;

public class Palindrome {
    public static void main(String[] args) {
        Function<String,String> f1=s->{
            String rev="";
            for(int i=s.length()-1;i>=0;i--)
                rev=rev+s.charAt(i);
            return rev;
        };
        Function<String,Boolean> f2=(s1)->{
            String r=f1.apply(s1);
            if(s1.equals(r))
               return true;
            else
                return false;
        };
        System.out.println(f2.apply("aba"));
    }
}
