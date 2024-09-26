package com.practice.CodingCourse;

import java.util.HashMap;

//Most frequently occurring element in an array
// [1,3,1,3,2,1]  result : 1
public class Problem1 {
    public static void main(String[] args) {
        int a[]={1,3,1,3,2,1,3,3};
        var map=new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],1);
            }
            else{
                map.put(a[i],map.get(a[i])+1);
            }
        }
        int key=0,value=0;
        for(Integer k :map.keySet()){
            if(map.get(k)>value) {
                value = map.get(k);
                key = k;
            }
        }
        System.out.println(key+" has the highest occurrence");
    }
}
