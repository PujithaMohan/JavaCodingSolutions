package com.practice.Lambdas;

import java.util.*;
import java.util.function.Function;

public class CreateMap {
    public static void main(String[] args) {

        List<String> list=Arrays.asList("Pujitha","Sai Kiran","Juhi","Usha","Mohan");
        Map<String,Integer> map=convertListToMap(list,s->s.length());
        System.out.println(map);
    }
    private static <T,R> Map<T,R> convertListToMap(List<T> list, Function<T, R> f1){
        Map<T,R> m=new HashMap<>();
        for(T a:list)
            m.put(a,f1.apply(a));
        return m;
    }
}
