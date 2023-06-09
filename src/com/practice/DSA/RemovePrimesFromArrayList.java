package com.practice.DSA;

import java.util.ArrayList;
import java.util.List;

public class RemovePrimesFromArrayList {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7,8,9,10};
        List<Integer> list=new ArrayList<>();
        for(int x:a)
            list.add(x);
        for(int i= list.size()-1;i>=0;i--){
            if(isPrime(list.get(i)))
                list.remove(i);
        }
        System.out.println(list);
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false ;
        return true;
    }
}
