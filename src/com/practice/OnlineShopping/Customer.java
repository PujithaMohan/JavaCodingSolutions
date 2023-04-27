package com.practice.OnlineShopping;

import java.util.Optional;

public class Customer {
    private final String name;
    private CreditCard creditCard;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }

    public Customer(String name, long cc) {
        this.name = name;
        this.creditCard = new CreditCard(cc);
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
    public int calculateDiscount(){
        return 0;
    }

    public Optional<Order> checkout(ShoppingCart shoppingCart){
        Optional<Object> payment=creditCard.mkPayment(shoppingCart.getTotalCost());
        return payment.isPresent()? Optional.of(new Order(shoppingCart, this, (Payment) payment.get())) : Optional.empty();
    }
}
