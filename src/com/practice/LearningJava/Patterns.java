package com.practice.LearningJava;

public class Patterns {
    public static void main(String[] args) {
        //Right Triangle
//        for(int i=1;i<5;i++){
//            for(int j=1;j<=i;j++)
//                System.out.print("*");
//            System.out.println();
//        }
//        //Left Triangle
//        for(int i=1;i<5;i++){
//            for(int j=4;j>i;j--) {
//                System.out.print(" ");
//            }
//            for(int k=1;k<i+1;k++)
//                System.out.print("*");
//            System.out.println();
//        }
//        //Pyramid Pattern
//
//        for(int i=1;i<5;i++){
//            for(int j=i;j<5;j++)
//                System.out.print(" ");
//            for(int j=1;j<=i;j++)
//                System.out.print("*"+" ");
//            System.out.println();
//        }
//        //Diamond pattern
//        for(int i=1;i<5;i++){
//            for(int j=i;j<5;j++)
//                System.out.print(" ");
//            for(int j=1;j<=i;j++)
//                System.out.print("*"+" ");
//            System.out.println();
//        }
//        for(int i=1;i<5;i++){
//            for(int j=1;j<=i+1;j++)
//                System.out.print(" ");
//            for(int j=3;j>=i;j--)
//                System.out.print("*"+" ");
//            System.out.println();
//        }
        //Alphabet A
       for(int i=0;i<10;i++){
           if(i==0||i==5){
               for (int k=0;k<5;k++)
                    System.out.print("*"+" ");
           }
           for(int j=0;j<11;j++){
               if(j==0||j==10)
               System.out.print("*");
               else
                   System.out.print(" ");
           }
           System.out.println();
       }
            }
    }

