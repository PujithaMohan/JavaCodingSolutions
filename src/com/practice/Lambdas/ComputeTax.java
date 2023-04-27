package com.practice.Lambdas;

import java.util.HashMap;
import java.util.Map;

public class ComputeTax {
    public static void main(String[] args) {
        Cart cart=new Cart();
        Map<String,Integer> map= cart.addItems();

    }
}
class Cart{
    Map<String,Integer> items=new HashMap<>();
    public Map<String,Integer> addItems(){
        items.put("Oil",500);
        items.put("Ghee",250);
        items.put("Tea",120);
        return items;
    }
}
