package fooddeliverysystem;

import java.util.*;

public class Cart {
    private Map<FoodItem, Integer> items = new HashMap<>();

    public void addItem(FoodItem foodItem, int quantity) {
        items.put(foodItem, items.getOrDefault(foodItem, 0) + quantity);
    }

    public void removeItem(FoodItem foodItem) {
        items.remove(foodItem);
    }

    public Map<FoodItem, Integer> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cart:\n");
        double total = 0;
        for (Map.Entry<FoodItem, Integer> e : items.entrySet()) {
            double cost = e.getKey().getPrice() * e.getValue();
            sb.append("Food: ").append(e.getKey().getName())
              .append(", Qty: ").append(e.getValue())
              .append(", Cost: Rs. ").append(cost).append("\n");
            total += cost;
        }
        sb.append("Total Cost: Rs. ").append(total);
        return sb.toString();
    }
}
