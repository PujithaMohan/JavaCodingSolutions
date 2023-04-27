package com.practice.DSA;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={14,90,45,96,33,-6,11,4};
        for(int i=0;i<a.length;i++){
            int minValue=a[i];
            int minIndex=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<minValue){
                    minValue=a[j];
                    minIndex=j;
                    }
            }
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
        for(int x:a)
            System.out.print(x+" ");
    }
}
