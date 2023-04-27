package com.practice.OnlineShopping;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        LineItem lineItem1=new LineItem(new DigitalProduct("video",1000),2);
        LineItem lineItem2=new LineItem(new PhysicalProduct("f",200),1);
        ShoppingCart sc=new ShoppingCart();
        sc.addLineItem(lineItem1);
        sc.addLineItem(lineItem2);
        System.out.println(sc.getTotalCost());
        System.out.println(sc.toString());
        Customer c1=new Customer("Puji",1234567);
       Optional<Order> order=c1.checkout(sc);
       System.out.println(order);
    }
}
