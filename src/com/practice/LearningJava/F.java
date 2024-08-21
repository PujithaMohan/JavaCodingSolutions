package com.practice.LearningJava;

public class F {
    public static void main(String[] args) {
        int n=5,f=0,f0=0,f1=1;
        for(int i=0;i<n-1;i++){
            System.out.println(f);
            f=f0+f1;
            f0=f1;
            f1=f;
            if (i == n - 2) {
                System.out.println("er"+f);
            }
        }
    }
}
