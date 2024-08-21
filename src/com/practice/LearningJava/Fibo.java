package com.practice.LearningJava;

public class Fibo {
static int fibonaci(int n,int f0,int f1){
    if(n!=0) {

        int f = f0 + f1;
        System.out.print(f+" ");
        f0 = f1;
        f1 = f;
        n++;
        return fibonaci(n, f0, f1);
    }
    else {
        return 1;
    }
    }
    public static void main(String[] args) {
        int n=0;
        int f0=0;
        int f1=1;
        System.out.print(f0+" "+f1+" ");
        System.out.println(fibonaci(n,f0,f1)+"result");


//        System.out.print(f0+" "+f1+" ");
//        for(int i=0;i<n;i++) {
//            int f=f0+f1;
//            f0=f1;
//            f1=f;
//            System.out.print(f+" ");
//        }

    }
}
