package com.practice.LearningJava;

public class MaxnMinOfArray {
    public static void main(String[] args) {
        int a[]={23,65,28,98,45,36,81};
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=1;i<a.length;i++){
            if(max<a[i])
                max=a[i];
        }
        System.out.println(max);
        for(int i=1;i<a.length;i++){
            if(min>a[i])
                min=a[i];
        }
        System.out.println(min);
    }
}
