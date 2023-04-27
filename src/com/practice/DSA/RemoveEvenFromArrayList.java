package com.practice.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEvenFromArrayList {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);//if using asList, resulting in UnsupportedOperationException
        //because asList is wrapper around Array,cannot add or remove ele but we can modify values
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        for(int i= list.size()-1;i>=0;i--)
            if(list.get(i)%2==0)
                list.remove(i);
        System.out.println(list);
    }
}
