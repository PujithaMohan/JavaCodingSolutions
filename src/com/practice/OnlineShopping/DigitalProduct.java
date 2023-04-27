package com.practice.OnlineShopping;

public class DigitalProduct extends Product {
    public DigitalProduct(String name, int price) {
        super(name, price);
    }

    @Override
    public int calculateDiscount() {
        return 0;
    }
}
