package com.practice.LearningJava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //121 100 001
        int numb=454,temp=numb,reminder=0,sum=0;
        while(numb>0){
            reminder=numb%10;
            sum=sum*10+reminder;
            numb=numb/10;
        }
        System.out.println(temp);
        if(temp==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
        palin();
    }
    public static void palin(){
        System.out.println("Enter a number/string");
       Scanner sc=new Scanner(System.in);
       String original=sc.next();
       String reverse="";
        System.out.println(original.length()-1);
       for(int i=original.length()-1;i>0;i--)
           reverse=reverse+original.charAt(i);
       if(original.equals(reverse))
           System.out.println("Palindrome");
       else
           System.out.println("Not Palindrome");
    }

}
