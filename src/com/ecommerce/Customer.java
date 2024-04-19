package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final List<Product> shoppingCart;

    public Customer(String name) {
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    public String getName() {
        return name;
    }

    // Getter for shoppingCart
    public List<Product> getShoppingCart() {
        return shoppingCart;
    }
}
