package fooddeliverysystem;

import java.util.*;

public class Main {

    private static Map<Integer, Restaurant> restaurants = new HashMap<>();
    private static Map<Integer, Customer> customers = new HashMap<>();
    private static Map<Integer, DeliveryPerson> deliveryPersons = new HashMap<>();
    private static Map<Integer, Order> orders = new HashMap<>();
    private static int orderCounter = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n====== Online Food Delivery System ======");
            System.out.println("1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> adminMenu(sc);
                case 2 -> customerMenu(sc);
                case 3 -> {
                    System.out.println("Thank you! Exiting system...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }

    // ------------------ ADMIN MENU --------------------
    private static void adminMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Restaurant");
            System.out.println("2. Add Food Item to Restaurant");
            System.out.println("3. Remove Food Item from Restaurant");
            System.out.println("4. View Restaurants and Menus");
            System.out.println("5. View Orders");
            System.out.println("6. Add Delivery Person");
            System.out.println("7. Assign Delivery Person to Order");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addRestaurant(sc);
                case 2 -> addFoodItemToRestaurant(sc);
                case 3 -> removeFoodItemFromRestaurant(sc);
                case 4 -> viewRestaurants();
                case 5 -> viewOrders();
                case 6 -> addDeliveryPerson(sc);
                case 7 -> assignDeliveryPerson(sc);
                case 8 -> System.out.println("Exiting Admin Module");
                default -> System.out.println("Invalid option!");
            }
        } while (choice != 8);
    }

    // ------------------ CUSTOMER MENU --------------------
    private static void customerMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1. Add Customer");
            System.out.println("2. View Food Items");
            System.out.println("3. Add Food to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. View Orders");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addCustomer(sc);
                case 2 -> viewRestaurants();
                case 3 -> addFoodToCart(sc);
                case 4 -> viewCart(sc);
                case 5 -> placeOrder(sc);
                case 6 -> viewCustomerOrders(sc);
                case 7 -> System.out.println("Exiting Customer Module");
                default -> System.out.println("Invalid option!");
            }
        } while (choice != 7);
    }

    // ------------------ ADMIN FUNCTIONS --------------------
    private static void addRestaurant(Scanner sc) {
        System.out.print("Enter Restaurant ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Restaurant Name: ");
        String name = sc.nextLine();
        restaurants.put(id, new Restaurant(id, name));
        System.out.println("Restaurant added successfully!");
    }

    private static void addFoodItemToRestaurant(Scanner sc) {
        System.out.print("Enter Restaurant ID: ");
        int rid = sc.nextInt();
        Restaurant r = restaurants.get(rid);
        if (r == null) {
            System.out.println("Restaurant not found!");
            return;
        }
        System.out.print("Enter Food Item ID: ");
        int fid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Food Item Name: ");
        String fname = sc.nextLine();
        System.out.print("Enter Food Item Price: ");
        double price = sc.nextDouble();
        r.addFoodItem(new FoodItem(fid, fname, price));
        System.out.println("Food item added successfully!");
    }

    private static void removeFoodItemFromRestaurant(Scanner sc) {
        System.out.print("Enter Restaurant ID: ");
        int rid = sc.nextInt();
        Restaurant r = restaurants.get(rid);
        if (r == null) {
            System.out.println("Restaurant not found!");
            return;
        }
        System.out.print("Enter Food Item ID to remove: ");
        int fid = sc.nextInt();
        r.removeFoodItem(fid);
        System.out.println("Food item removed successfully!");
    }

    private static void viewRestaurants() {
        if (restaurants.isEmpty()) {
            System.out.println("No restaurants available!");
            return;
        }
        for (Restaurant r : restaurants.values()) {
            System.out.println("\nRestaurant ID: " + r.getId() + ", Name: " + r.getName());
            for (FoodItem f : r.getMenu()) {
                System.out.println("- Food Item ID: " + f.getId() + ", Name: " + f.getName() + ", Price: Rs." + f.getPrice());
            }
        }
    }

    private static void viewOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders yet!");
            return;
        }
        orders.values().forEach(System.out::println);
    }

    private static void addDeliveryPerson(Scanner sc) {
        System.out.print("Enter Delivery Person ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Delivery Person Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Contact No: ");
        long contact = sc.nextLong();
        deliveryPersons.put(id, new DeliveryPerson(id, name, contact));
        System.out.println("Delivery person added successfully!");
    }

    private static void assignDeliveryPerson(Scanner sc) {
        System.out.print("Enter Order ID: ");
        int oid = sc.nextInt();
        Order order = orders.get(oid);
        if (order == null) {
            System.out.println("Order not found!");
            return;
        }
        System.out.print("Enter Delivery Person ID: ");
        int did = sc.nextInt();
        DeliveryPerson dp = deliveryPersons.get(did);
        if (dp == null) {
            System.out.println("Delivery Person not found!");
            return;
        }
        order.setDeliveryPerson(dp);
        System.out.println("Delivery person assigned to order successfully!");
    }

    // ------------------ CUSTOMER FUNCTIONS --------------------
    private static void addCustomer(Scanner sc) {
        System.out.print("Enter User ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Username: ");
        String name = sc.nextLine();
        System.out.print("Enter Contact No: ");
        long contact = sc.nextLong();
        customers.put(id, new Customer(id, name, contact));
        System.out.println("Customer created successfully!");
    }

    private static void addFoodToCart(Scanner sc) {
        System.out.print("Enter Customer ID: ");
        int cid = sc.nextInt();
        Customer c = customers.get(cid);
        if (c == null) {
            System.out.println("Customer not found!");
            return;
        }

        System.out.print("Enter Restaurant ID: ");
        int rid = sc.nextInt();
        Restaurant r = restaurants.get(rid);
        if (r == null) {
            System.out.println("Restaurant not found!");
            return;
        }

        System.out.print("Enter Food Item ID: ");
        int fid = sc.nextInt();
        FoodItem selected = null;
        for (FoodItem f : r.getMenu()) {
            if (f.getId() == fid) {
                selected = f;
                break;
            }
        }
        if (selected == null) {
            System.out.println("Food item not found!");
            return;
        }

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        c.getCart().addItem(selected, qty);
        System.out.println("Food item added to cart!");
    }

    private static void viewCart(Scanner sc) {
        System.out.print("Enter Customer ID: ");
        int cid = sc.nextInt();
        Customer c = customers.get(cid);
        if (c == null) {
            System.out.println("Customer not found!");
            return;
        }
        System.out.println(c.getCart());
    }

    private static void placeOrder(Scanner sc) {
        System.out.print("Enter Customer ID: ");
        int cid = sc.nextInt();
        Customer c = customers.get(cid);
        if (c == null) {
            System.out.println("Customer not found!");
            return;
        }
        Order order = new Order(orderCounter++, c);
        for (Map.Entry<FoodItem, Integer> e : c.getCart().getItems().entrySet()) {
            order.addItem(e.getKey(), e.getValue());
        }
        orders.put(order.getOrderId(), order);
        c.getCart().getItems().clear();
        System.out.println("Order placed successfully! Your Order ID is: " + order.getOrderId());
    }

    private static void viewCustomerOrders(Scanner sc) {
        System.out.print("Enter Customer ID: ");
        int cid = sc.nextInt();
        Customer c = customers.get(cid);
        if (c == null) {
            System.out.println("Customer not found!");
            return;
        }
        for (Order o : orders.values()) {
            if (o.getCustomer().equals(c)) {
                System.out.println(o);
            }
        }
    }
}

