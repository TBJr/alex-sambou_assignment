package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private List<Product> shoppingCart;

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : shoppingCart) {
            total += product.getPrice();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void placeOrder() {
        // Logic to place order
    }

    // Getter for shoppingCart
    public List<Product> getShoppingCart() {
        return shoppingCart;
    }
}
