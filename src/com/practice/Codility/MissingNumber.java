package com.practice.Codility;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
int a[]={1, 3, 6, 4, 1, 2};
        System.out.println(solution(a));
    }
    public static int solution(int A[]){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            min=Math.min(min,A[i]);
            max=Math.max(max,A[i]);
        }
        for(int i=min;i<=max;i++){
            if(!Arrays.asList(A).contains(i)){
                return i;}
            else if(Arrays.stream(A).allMatch(x -> x < 0)){
                return 1;}
            else if(Arrays.asList(A).contains(i)){
                return max+1;}
        }
        return 1;
    }
}
