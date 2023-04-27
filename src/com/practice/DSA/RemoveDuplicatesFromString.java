package com.practice.DSA;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        //brute force
        String a="aabbbbbbcdef",res="";
        char b[]=a.toCharArray();
        for(int i=0;i<b.length;i++){
            boolean repeated=false;
            for(int j=i+1;j<b.length;j++){
                if(b[i]==b[j]){
                    repeated=true;
                }
            }
            if(!repeated)
               res=res+b[i];
        }
        System.out.println(res);

        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<b.length;i++)
            set.add(b[i]);
        for(char x:set)
           System.out.print(x);
    }
}
