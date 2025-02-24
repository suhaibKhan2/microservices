package com.wipro.microservices.s;

import java.util.Random;

class Customer {
    private String name;
    private String address;

    // Constructor
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Order {
    private Customer customer;
    private String orderId;
    private String itemName;
    private int quantity;
    private int totalBillAmt;

    // Constructor
    public Order(String itemName, int quantity, Customer customer) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.customer = customer;
        setOrderId(itemName); // Automatically set orderId when the order is created
    }

    // Getters and setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        Random random = new Random();
        this.orderId = orderId + "-" + random.nextInt(500);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
        setOrderId(itemName);  // Regenerate orderId when itemName changes
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalBillAmt() {
        return totalBillAmt;
    }

    public void setTotalBillAmt(int totalBillAmt) {
        this.totalBillAmt = totalBillAmt;
    }
}

class OrderPreparation {
    public void prepareOrder(Order order) {
        System.out.println("Preparing order for customer - "
                            + order.getCustomer().getName()
                            + " who has ordered "
                            + order.getItemName());
    }
}

class BillCalculator {
    private Order order;

    public BillCalculator(Order order) {
        this.order = order;
    }

    public void calculateBill() {
        Random rand = new Random();
        int totalAmt = rand.nextInt(200) * order.getQuantity();
        order.setTotalBillAmt(totalAmt);
        System.out.println("Order with order id "
                           + order.getOrderId()
                           + " has a total bill amount of "
                           + order.getTotalBillAmt());
    }
}

class DeliveryManager {
    public void manageDelivery(Order order) {
        System.out.println("Delivering the order");
        System.out.println("Order with order id as "
                           + order.getOrderId()
                           + " being delivered to "
                           + order.getCustomer().getName());
        System.out.println("Order is to be delivered to: "
                           + order.getCustomer().getAddress());
    }
}

public class PizzaHut {
    public static void main(String[] args) {
        // Create a Customer
        Customer customer = new Customer("John Doe", "Pune");

        // Create an Order for the customer
        Order order = new Order("Pizza", 2, customer);

        // Prepare the order
        OrderPreparation orderPreparation = new OrderPreparation();
        orderPreparation.prepareOrder(order);

        // Calculate the bill
        BillCalculator billCalculator = new BillCalculator(order);
        billCalculator.calculateBill();

        // Manage the delivery
        DeliveryManager deliveryManager = new DeliveryManager();
        deliveryManager.manageDelivery(order);
    }
}
