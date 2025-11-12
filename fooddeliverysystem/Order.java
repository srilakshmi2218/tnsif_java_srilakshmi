package fooddeliverysystem;

import java.util.*;

public class Order {
    private int orderId;
    private Customer customer;
    private Map<FoodItem, Integer> items = new HashMap<>();
    private String status = "Pending";
    private DeliveryPerson deliveryPerson;
    private String deliveryAddress;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public int getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public Map<FoodItem, Integer> getItems() { return items; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
    public void setDeliveryPerson(DeliveryPerson deliveryPerson) { this.deliveryPerson = deliveryPerson; }

    public void addItem(FoodItem item, int quantity) {
        items.put(item, quantity);
    }

    @Override
    public String toString() {
        return "Order{orderId=" + orderId + ", customer=" + customer.getUsername() +
                ", items=" + items + ", status='" + status + "', deliveryPerson=" +
                (deliveryPerson != null ? deliveryPerson.getName() : "Not Assigned") + "}";
    }
}

