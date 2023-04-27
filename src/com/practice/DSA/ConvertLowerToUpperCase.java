package com.practice.DSA;

public class ConvertLowerToUpperCase {
    public static void main(String[] args) {
        //A-capital give char=a-small of given char
        //A-M=a-m
        //A-a+m=M
        String a="i am pujitha mohan";
        char[] c=a.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>='a'&&c[i]<='z') {
                char res = (char) ('A' - 'a' + c[i]);
                c[i]=res;
            }
        }
        for(char n:c)
            System.out.print(n);

    }
}
