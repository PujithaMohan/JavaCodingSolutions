package com.practice.LearningJava;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSet {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();//insertion order, ordered
        list.add(1);
        list.add(5);
        list.add(3);
        Set<Integer> set=new HashSet<>();//unordered/sorted, no insertion order
        set.add(1);
        set.add(5);
        set.add(3);
        System.out.println(list);
        System.out.println(list.add(5));
        System.out.println(set);
        System.out.println(set.add(5));

    }
}
