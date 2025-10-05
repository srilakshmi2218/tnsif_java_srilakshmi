package basic;

public class BasicCode {

    public static void main(String[] args) {

        // Identifiers - age, salary, isPassed & grade
        int age = 20; // variable (integer)
        double salary = 50000.00; // variable (double)
        boolean isPassed = true; // variable (boolean)
        char grade = 'A'; 

        // Type Casting
        double newSalary = age;        
        int roundSalary = (int) salary;  

        // Arithmetic Operation
        int bonus = 5000;
        int total = roundSalary + bonus;

        // Output
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Is Passed: " + isPassed);
        System.out.println("Grade: " + grade);
        System.out.println("New Salary (implicit cast): " + newSalary);
        System.out.println("Rounded Salary (explicit cast): " + roundSalary);
        System.out.println("Total Salary with Bonus: " + total);
    }
}
