package com.practice.Codility;

public class CyclicRotation {
    public static void main(String[] args) {
        int k=3;
        int a[]={};
        while(k>0&&k!=a.length&&a.length>0){
            int temp=a[a.length-1];
            for(int i=a.length-1;i>0;i--){
                a[i]=a[i-1];
            }
            a[0]=temp;
            k--;
        }
        for(int x:a)
            System.out.println(x);
    }
}
