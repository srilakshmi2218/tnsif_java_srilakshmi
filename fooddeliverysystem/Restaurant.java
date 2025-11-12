package fooddeliverysystem;

import java.util.*;

public class Restaurant {
    private int id;
    private String name;
    private List<FoodItem> menu;

    public Restaurant(int id, String name) {
        this.id = id;
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public List<FoodItem> getMenu() { return menu; }

    public void addFoodItem(FoodItem item) {
        menu.add(item);
    }

    public void removeFoodItem(int itemId) {
        menu.removeIf(f -> f.getId() == itemId);
    }

    @Override
    public String toString() {
        return "Restaurant{id=" + id + ", name='" + name + "', menu=" + menu + "}";
    }
}

