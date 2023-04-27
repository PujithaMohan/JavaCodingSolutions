package com.practice.DSA;

public class TransposeOfTwoDArray {
    public static void main(String[] args) {
        int two[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};

            for(int a=1;a< two.length;a++){
                for(int b=0;b<two[0].length;b++){//if we use b<i then no need of if block
                    if(a==b)
                        break;
                    int temp=0;
                    temp=two[a][b];
                    two[a][b]=two[b][a];
                    two[b][a]=temp;
                    System.out.println(two[a][b]+" "+a+" "+b);
            }
        }

            for(int i=0;i<two.length;i++) {
                for (int j = 0; j < two[0].length; j++)
                    System.out.print(two[i][j]+" ");
                System.out.println();
            }
    }
}
