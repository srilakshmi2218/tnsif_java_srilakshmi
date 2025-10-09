package Scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter College Name: ");
        String cname = sc.nextLine(); // ✅ Use nextLine() to capture full name (with spaces)

        System.out.println("Enter Counselling Code: ");
        int code = sc.nextInt();

        System.out.println("The College name is: " + cname + ", The College code is: " + code);
        
        sc.close(); // ✅ Always close scanner
    }
}
