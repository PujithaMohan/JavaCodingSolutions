package com.practice.DSA;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        String a="I am Pujitha";
        for(int i=0;i<a.length();i++){
            char b=a.charAt(i);
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b==' ')
                continue;
            System.out.print(a.charAt(i));
        }
    }
}
