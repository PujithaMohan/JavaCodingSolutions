package com.practice.DSA;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int temp=0;
        for(int i=0;i<a.length/2;i++){
            temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        for (int i:a)
            System.out.println(i);
    }
}
