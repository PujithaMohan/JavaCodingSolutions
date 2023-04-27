package com.practice.DSA;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array to compute sum");
        int n=sc.nextInt();
        int sum=0,a[]=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            sum+=a[i];
        System.out.println("Sum : "+sum);
    }
}
