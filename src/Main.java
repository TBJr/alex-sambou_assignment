import com.ecommerce.*;
import com.ecommerce.orders.*;

public class Main {
    public static void main(String[] args) {
        // Create instances of products
        com.ecommerce.Product product1 = new com.ecommerce.Product(1, "Laptop", 999.99);
        com.ecommerce.Product product2 = new com.ecommerce.Product(2, "Smartphone", 599.99);

        // Create instance of customer
        com.ecommerce.Customer customer = new com.ecommerce.Customer(1, "Alex");

        // Add products to the customer's shopping cart
        customer.addToCart(product1);
        customer.addToCart(product2);

        // Create instance of order
        Order order = new Order(1, customer, customer.getShoppingCart());

        // Display information
        System.out.println("Product: " + product1.getName() + ", Price: $" + product1.getPrice());
        System.out.println("Customer: " + customer.getName());
        System.out.println(order.generateOrderSummary());
    }
}
