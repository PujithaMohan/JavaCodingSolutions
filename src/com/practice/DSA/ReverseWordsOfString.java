package com.practice.DSA;

public class ReverseWordsOfString {
    public static void main(String[] args) {
        String a="I am Pujitha Mohan";
        String result="";
        String b[]=a.split(" ");
        for(int i=b.length-1;i>=0;i--)
            if(i==0)
            result=result+b[i];
        else
                result=result+b[i]+" ";
        System.out.println(result);

    }
}
