package com.practice.OnlineShopping;

import java.util.Optional;
import java.util.UUID;

public class CreditCard {
    private final long number;

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                '}';
    }

    public CreditCard(long number) {

        this.number = number;
    }
    public Optional<Object> mkPayment(int value){
        if(Math.random()>0.3){
            return Optional.of(new Payment(this, value, UUID.randomUUID()));
        }
        else {
            return Optional.empty();
        }
    }
}