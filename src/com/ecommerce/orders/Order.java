package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product; // Importing Product from com.ecommerce package

import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private List<com.ecommerce.Product> products; // Using fully qualified name
    private double total;

    public Order(int orderID, Customer customer, List<Product> products) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
        calculateTotal();
    }

    private void calculateTotal() {
        total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
    }

    public String generateOrderSummary() {
        // Generate order summary
        return "Order ID: " + orderID + "\nCustomer: " + customer.getName() + "\nTotal: $" + total;
    }

    // Getter for products
    public List<com.ecommerce.Product> getProducts() {
        return products;
    }
}
