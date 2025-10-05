package basic;

public class MainClass {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setId(101);
        c1.setCname("Raja");
        c1.setCity("Villupuram");

        System.out.println("Customer 1 Details:");
        System.out.println("ID: " + c1.getId());
        System.out.println("Name: " + c1.getCname());
        System.out.println("City: " + c1.getCity());

        Customer c2 = new Customer();
        c2.setId(102);
        c2.setCname("Kumar");
        c2.setCity("Chennai");

        System.out.println("\nCustomer 2 Details:");
        System.out.println("ID: " + c2.getId());
        System.out.println("Name: " + c2.getCname());
        System.out.println("City: " + c2.getCity());
    }
}
