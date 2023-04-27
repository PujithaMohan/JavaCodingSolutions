package com.practice.OnlineShopping;

public class PhysicalProduct extends Product {
    public PhysicalProduct(String name, int price) {
        super(name, price);
    }

    @Override
    public int calculateDiscount() {
        return 0;
    }
}
