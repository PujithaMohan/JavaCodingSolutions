package com.practice.OnlineShopping;

public class Order {
    private ShoppingCart shoppingCart;
    private Customer customer;
    private Payment payment;
    //private Customer customer;

    public Order(ShoppingCart shoppingCart, Customer customer, Payment payment) {
        this.shoppingCart = shoppingCart;
        this.customer = customer;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "shoppingCart=" + shoppingCart +
                ", customer=" + customer +
                ", payment=" + payment +
                '}';
    }
}
