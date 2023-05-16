package com.practice.Lambdas;

public class ThreadImplementation {
    public static void main(String[] args) {
        Runnable runnable=()->{
            for(int i=0;i<5;i++)
                System.out.print(i+" ");
        };
        runnable.run();
    }
}
