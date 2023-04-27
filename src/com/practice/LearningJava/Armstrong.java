package com.practice.LearningJava;

public class Armstrong {
    public static void main(String[] args) {
        int n=500,temp,digits,sum;
        for(int i=1;i<n;i++){
            temp=i;
            digits=0;
            while(temp>0){
                temp=temp/10;
                digits++;
            }
            temp=i;
            sum=0;
            while(temp>0){
                int r=temp%10;
                sum+=Math.pow(r,digits);
                temp=temp/10;
            }
            if(i==sum)
                System.out.println(i);
            //else
               // System.out.println(i);
        }
    }
}
