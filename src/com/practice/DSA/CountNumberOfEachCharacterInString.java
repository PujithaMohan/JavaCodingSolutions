package com.practice.DSA;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountNumberOfEachCharacterInString {
    public static void main(String[] args) {
//count how many letters are there and find how many times each letter is repeated in the given sentence "Hello how are you"
        String a="Hello how are you";
        for(int i=0;i<a.length();i++) {
            long count = compute(a, a.charAt(i));
            System.out.println(a.charAt(i)+" "+count);
        }
    }
    public static long compute(String a,char x){
        return a.codePoints().filter(ch -> ch == x).count();
    }
}
//wrong solution