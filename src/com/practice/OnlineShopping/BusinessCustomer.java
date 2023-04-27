package com.practice.OnlineShopping;

public class BusinessCustomer extends Customer {
    public enum BusinessSize{SMALL,MEDIUM,LARGE};
    private BusinessSize size;
    public BusinessCustomer(String name, long cc,BusinessSize size) {
        super(name, cc);
        this.size=size;
    }

    @Override
    public int calculateDiscount() {
        switch(size){
            case SMALL: return 5;
            case MEDIUM : return 10;
            case LARGE : return 15;
            default: throw new AssertionError("Invalid size"+this);
        }
    }
}
