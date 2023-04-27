package com.practice.OnlineShopping;

import java.util.*;

public class Catalogue {
    public static Map<String, Product> m=new HashMap<>();
    static{
        m.put("Pen",new PhysicalProduct("Pen",5));
        m.put("Book",new  PhysicalProduct("Book",100));
    }
    public static Product getProduct(String name){
        return m.get(name);
    }

}
