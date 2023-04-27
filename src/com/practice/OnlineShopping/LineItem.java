package com.practice.OnlineShopping;

public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

    public Product getProduct(){
        return product;
    }
    public int getPrice(){
        return product.getPrice()*quantity;
    }
}
