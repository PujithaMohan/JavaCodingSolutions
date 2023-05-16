package com.practice.streams;

import java.util.*;
import java.util.stream.Collectors;
class ProductSteamEx {
    int id;
    String name;
    float price;

    public ProductSteamEx(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        List<ProductSteamEx> productsList = new ArrayList<ProductSteamEx>();
        //Adding Products
        productsList.add(new ProductSteamEx(1, "HP Laptop", 25000f));
        productsList.add(new ProductSteamEx(2, "Dell Laptop", 30000f));
        productsList.add(new ProductSteamEx(3, "Lenevo Laptop", 28000f));
        productsList.add(new ProductSteamEx(4, "Sony Laptop", 28000f));
        productsList.add(new ProductSteamEx(5, "Apple Laptop", 90000f));
        List<Float> productPriceList2 = productsList.stream()
                .filter(p -> p.price > 30000)
                .map(p -> p.price)
                .collect(Collectors.toList());
        System.out.println(productPriceList2);
    }
}