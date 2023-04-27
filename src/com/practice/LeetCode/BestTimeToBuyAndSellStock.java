package com.practice.LeetCode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int a=maxProfit(new int[]{1,2,10,5,3,9});
        System.out.println(a);
    }
    public static int maxProfit(int prices[]) {
        int profit=0,min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }else if(profit<prices[i]-min){
                profit=prices[i]-min;
            }
        }
        return profit;
    }
}
