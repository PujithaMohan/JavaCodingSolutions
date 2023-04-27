package com.practice.Codility;

public class BinaryGap {
    public static void main(String[] args) {
        int n=12,temp=n,i=0;
        String a=Integer.toString(n,2);
        //System.out.println(a);
        int bin[]=new int[4];
        while(temp>0){
            bin[i]=temp%2;
            temp=temp/2;
            i++;
        }
        // 11000001100
//        for(int x=bin.length-1;x>=0;x--)
//            System.out.print(bin[x]);
        int maxCount=0;
        String z="11111110011100000011010101";
        String[] res=z.replaceAll("0+$","").split("1");
        for(String b:res){
            if(b.length()>0&&b.length()>maxCount)
                maxCount=b.length();
        }
        System.out.println(maxCount);
    }
}
