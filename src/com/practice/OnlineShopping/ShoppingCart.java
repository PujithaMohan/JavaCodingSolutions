package com.practice.OnlineShopping;

import java.util.*;

public class ShoppingCart {
    @Override
    public String toString() {
        return "ShoppingCart{" +
                "productList=" + lineItems +
                '}';
    }

    private List<LineItem> lineItems=new ArrayList<LineItem>();

    public void addLineItem(LineItem lineItem){
        lineItems.add(lineItem);
    }
    public int getTotalCost(){
        return lineItems.stream().mapToInt(LineItem::getPrice).sum();
    }
}
