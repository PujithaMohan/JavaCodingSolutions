package com.practice.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PascalsTriangle {
    public static void main(String[] args) {
int a[]={1,2,2,3,4,5};
Set<Integer> s= new HashSet<>();
for(int i=0;i<a.length;i++)
    s.add(a[i]);
if(s.size()<a.length/2)
        System.out.println(s.size());
System.out.println(a.length/2);

Set<Integer> s1=Arrays.stream(a).boxed().collect(Collectors.toSet());
Math.min(a.length/2,s1.size());
    }
}
