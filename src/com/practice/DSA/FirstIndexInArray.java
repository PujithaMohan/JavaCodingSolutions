package com.practice.DSA;

public class FirstIndexInArray {
    public static void main(String[] args) {
        int a[]={1,5,2,7,8,2,6,3};
        System.out.println(findIndex(0,a,3));
    }
    public static int findIndex(int index,int[] a,int target){
        if(index==a.length)
            return -1;
        if(a[index]==target)
            return index;
        else {
            int idx=findIndex(index + 1, a, target);
            return idx;
        }

    }

}
