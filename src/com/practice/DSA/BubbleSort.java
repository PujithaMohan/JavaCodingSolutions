package com.practice.DSA;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={14,90,45,96,33,-6,11,4};
        for(int j=0;j<a.length-1;j++)
        for(int i=0;i<a.length-1-j;i++){
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        for(int x:a)
            System.out.print(x+" ");
    }
}
