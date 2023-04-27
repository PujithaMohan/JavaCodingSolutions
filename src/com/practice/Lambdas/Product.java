package com.practice.Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class ProductFilter{
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product(1,"Brush",33.3f));
        productList.add(new Product(2,"Paste",150));
        productList.add(new Product(3,"Soap",80.50f));
        productList.add(new Product(4,"Milk",38f));
        productList.add(new Product(5,"Tea Powder",100));
        List<Product> sortedProductList=productList.stream().sorted(Comparator.comparingInt(Product::getId)).collect(Collectors.toList());
        System.out.println(sortedProductList);
    }
}
