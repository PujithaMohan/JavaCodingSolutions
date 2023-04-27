package com.practice.LearningJava;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int a[] = {12, 21, 37, 49, 51, 68, 79, 88, 96, 105};
        int len = a.length;
        int key = 105, l = 0, h = len - 1;
        int index=binarySearch(a,l,h,key);
        if(index==-1)
            System.out.println("Key not found");
        else
            System.out.println("Key at index"+index);
    }
    public static int binarySearch(int a[],int l,int h,int key) {
        int m=(l+h/2);
        if(l>h)
            return -1;
        else{
            if(a[m]==key)
                return m;
            else if(a[m]<key)
                return binarySearch(a,m+1,h,key);
            else
                return binarySearch(a,l,m-1,key);
        }
    }
}
