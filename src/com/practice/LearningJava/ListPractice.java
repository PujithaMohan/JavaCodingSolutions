package com.practice.LearningJava;

import java.util.*;
public class ListPractice {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        l.add("red");
        l.add("yellow");
        l.add("blue");
        l.add("green");
        System.out.println(l);
        for(int i=0;i<l.size();i++)
            l.remove(i);
        System.out.println(l);
        for(String s:l)
            l.remove(s);
        String[] s=l.toArray(new String[0]);
    }
}
