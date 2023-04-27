package com.practice.Lambdas;

public class CreateThread{
    public static void main(String[] args) {
        Runnable r=()->{
            for(int i=0;i<5;i++)
                System.out.println(i);
        };
        Thread t=new Thread(r);
        t.start();
    }
}
