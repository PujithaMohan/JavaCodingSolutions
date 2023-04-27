package com.practice.LearningJava;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int a[] = {12, 21, 37, 49, 51, 68, 79, 88, 96, 105};
        int len = a.length;
        int key = 50, l = 0, h = len - 2, m = (l + h) / 2;
        while (l<=h) {
            if (key > a[m]) {
                l = m + 1;
                m = (l + h) / 2;
            } else if (key < a[m]) {
                h = m - 1;
                m = (l + h) / 2;
            } else{
                System.out.println("Key present at index " + m);
                break;
            }
        }
        if(l>h)
            System.out.println("Key not found");
    }
}
