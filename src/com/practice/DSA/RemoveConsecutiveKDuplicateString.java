package com.practice.DSA;

public class RemoveConsecutiveKDuplicateString {
    public static void main(String[] args) {
        String x="aabbbbbccccdd",res="";
         char a[]=x.toCharArray();
        int b=2,counter=0,j;
        if(b==1)
            res="";
        for(int i=0;i<a.length-1;i++){
            j=i+1;
            counter=1;
            while(a[i]==a[j]){
                counter++;
                j++;
        }
            if(counter!=b){
                while(i<j){
                res=res+a[i];
                i++;
                }
            }
            j=i+1;
    }
        System.out.println(res);
    }
}


