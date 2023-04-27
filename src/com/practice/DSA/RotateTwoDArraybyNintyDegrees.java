package com.practice.DSA;

public class RotateTwoDArraybyNintyDegrees {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        for(int i=0;i< a.length;i++){
            for(int j=0;j<i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        int length=a[0].length;
        for(int i=0;i< a.length;i++){
            for(int j=0;j<length/2;j++){
                int temp=0;
                temp=a[i][j];
                a[i][j]=a[i][length-j-1];
                a[i][length-j-1]=temp;
            }
        }
        for(int i=0;i< a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
