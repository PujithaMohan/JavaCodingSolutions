package com.practice.LearningJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Isogram {
    public static void main(String[] args) {
        String a="DAD";
        String b="ADD";
        Map<Character,Integer> res=computeOccurences(a);
        Map<Character,Integer> res1=computeOccurences(b);
        System.out.println(res.equals(res1));

        //efficient
        char arr[]=a.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static Map<Character,Integer> computeOccurences(String a){
        Map<Character,Integer> map=new HashMap<>();
        char arr[]=a.toCharArray();
        for(int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        return map;
    }
}
