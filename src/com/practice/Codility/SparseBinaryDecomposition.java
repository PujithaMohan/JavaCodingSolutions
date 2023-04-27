package com.practice.Codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SparseBinaryDecomposition {
    public static void main(String[] args) {
        int N=5,temp=N;
        List<Integer> res=new ArrayList<>();
        while(N>0){
            String r=Integer.toBinaryString(N);
            //System.out.println(r);
            int count=0;
            for(int i=0;i<r.length()-1;i++){
                if(r.charAt(i)=='1'&&r.charAt(i+1)=='1')
                    count++;
            }
            if(count==0)
                res.add(Integer.parseInt(r,2));
            N--;
        }
        for (Integer i:res)
            System.out.print(i+" ");
        System.out.println();
        Map<Integer,Integer> map=new HashMap();
        List<Integer> l=new ArrayList<>();
        for(int j=0;j<res.size();j++){
            if(map.containsKey(temp-res.get(j))){
                l.add(temp-res.get(j));
                l.add(res.get(j));
            }else{
                map.put(res.get(j),j);
            }
        }
        if(res.size()==0){
            System.out.println(-1);
        }else{
            Random rand = new Random();
            int randomElement = res.get(rand.nextInt(res.size()));
            System.out.println(randomElement);
        }

    }
}
