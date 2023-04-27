package com.practice.LearningJava;

public class Factorial {
    public static void main(String[] args) {
        int n=4,fact=1,f=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        f=fact(5);
        System.out.println(f);
    }
    public static int fact(int n){
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
}
