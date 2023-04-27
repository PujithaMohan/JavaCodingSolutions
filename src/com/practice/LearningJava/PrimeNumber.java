package com.practice.LearningJava;

public class PrimeNumber {
    public static void main(String[] args) {
        int e=100,s=2;
        for(s=2;s<e;s++){
            int count=0;
        for(int i=2;i<=s/2;++i){
            if(s%i==0) {
                count++;
                break;
            }
        }
            if(count<1)
                System.out.print(s+" ");
        }

    }
}
