package Encapsulation;
//This program stores food items and customer details using encapsulation and lets the customer 
//place an order while updating the item quantity, using getter methods, a reduce() method for 
//stock updates, and a canOrder() method to limit customer orders

import java.util.*;

class FoodItem {
    private String name;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int quantity) {
        this.name = name;
        if (price > 0) this.price = price;
        if (quantity >= 0) this.quantity = quantity;
    }

    public boolean reduce(int q) {
        if (quantity >= q) {
            quantity -= q;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return name + " - " + price + " (" + quantity + ")";
    }
}

class Customer {
    private String customerName;
    private int orders;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public boolean canOrder() {
        if (orders < 3) {
            orders++;
            return true;
        }
        return false;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getOrders() {
        return orders;
    }

    public String toString() {
        return customerName + " (Orders: " + orders + ")";
    }
}

public class FoodSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of food items: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<FoodItem> menu = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Item name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();
            menu.add(new FoodItem(name, price, qty));
        }

        System.out.print("\nEnter customer name: ");
        String custName = sc.nextLine();
        Customer customer = new Customer(custName);

        System.out.println("\n--- Menu ---");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i));
        }

        System.out.print("\nSelect item number: ");
        int choice = sc.nextInt();
        System.out.print("Enter quantity: ");
        int q = sc.nextInt();

        FoodItem selected = menu.get(choice - 1);

        if (customer.canOrder() && selected.reduce(q)) {
            double total = q * selected.getPrice();
            System.out.println("\nOrder Placed!");
            System.out.println("Customer: " + customer);
            System.out.println("Item: " + selected.getName());
            System.out.println("Total Price: " + total);
        } else {
            System.out.println("\nOrder Failed!");
        }

        System.out.println("\nUpdated Item: " + selected);
        System.out.println("Customer Status: " + customer);

        sc.close();
    }
}
