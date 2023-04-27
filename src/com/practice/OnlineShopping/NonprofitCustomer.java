package com.practice.OnlineShopping;

public class NonprofitCustomer extends Customer {

    public NonprofitCustomer(String name, long cc) {
        super(name, cc);
    }

    @Override
    public int calculateDiscount() {
        return 15;
    }
}
