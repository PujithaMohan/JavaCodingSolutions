package com.practice.LearningJava;

public class LengthOfLongestPalindrome {
    public static void main(String[] args) {
        String s="abba";
        int len=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String sub=s.substring(i,j);
                if(isPalindrome(sub))
                    len=Math.max(len,sub.length());
            }
        }
        System.out.println(len);
    }
    public static boolean isPalindrome(String sub){
        int i=0,j=sub.length()-1;
        while(i<j) {
            if (sub.charAt(i) != sub.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}
