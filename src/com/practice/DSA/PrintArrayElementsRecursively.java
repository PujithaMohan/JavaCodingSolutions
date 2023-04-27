package com.practice.DSA;

public class PrintArrayElementsRecursively {
    public static void main(String[] args) {
        int a[]={14,90,45,96,33,-6,11,4};
        printArray(a,0);
    }
    public static void printArray(int[] arr,int index){
        if(index==arr.length)
            return;
        System.out.println(arr[index]);
        printArray(arr,index+1);
    }
}
