package com.practice.DSA;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String a="I am Pujitha Mohan";
        char s[]=a.toCharArray();
        int i=0,j=s.length-1;
        while(i<j){
            while(s[i]!='a'&&s[i]!='e'&&s[i]!='i'&&s[i]!='o'&&s[i]!='u')
                i++;
            while (s[j]!='a'&&s[j]!='e'&&s[j]!='i'&&s[j]!='o'&&s[j]!='u')
                j--;
            if(i>=j)
                break;
            char x=s[i];
            s[i]=s[j];
            s[j]=x;
            i++;
            j--;
        }
        for(char h:s)
            System.out.print(h);
    }
}
