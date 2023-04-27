package com.practice.LearningJava;

public class Fibonacci {
    public static void main(String[] args) {
        int count=10,f0=0,f1=1,f=1;
        System.out.print(f0+" "+f1+" ");
             fibo(f0,f1,f,count);
    }
    public static void fibo(int f0,int f1,int f,int count){
        if(count>=0){
        f=f0+f1;
        f0=f1;
        f1=f;
        count--;
        System.out.print(f+" ");
        fibo(f0,f1,f,count);}
    }
}
