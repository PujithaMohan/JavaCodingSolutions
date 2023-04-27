package com.practice.OnlineShopping;

import java.util.UUID;

public class Payment {
    private CreditCard creditCard;
    private int amount;
    private UUID paymentID;

    public Payment(CreditCard creditCard, int amount, UUID paymentID) {
        this.creditCard = creditCard;
        this.amount = amount;
        this.paymentID = paymentID;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "creditCard=" + creditCard +
                ", amount=" + amount +
                ", paymentID=" + paymentID +
                '}';
    }
}
