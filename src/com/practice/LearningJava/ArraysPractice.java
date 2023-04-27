package com.practice.LearningJava;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.SortedMap;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] a=new int[5];
        for(int i=0;i<a.length;i++)
            a[i]=i;
        int[] d=new int[5];
        for(int i=d.length-1,j=0;i>=0;i--,j++) {
            d[j] = i;
            System.out.println(i+"val");
        }
        String [] c={"a","b","c"};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(d));
        System.out.println(a.equals(d));
        System.out.println(Arrays.equals(a,d));
        //Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.compare(a,d));
        System.out.println(Arrays.binarySearch(a,4));
        System.out.println(Arrays.mismatch(a,d));
    }
}
