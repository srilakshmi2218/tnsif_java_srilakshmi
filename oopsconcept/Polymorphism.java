package oopsconcept;

// Method Overloading
class MathOp {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Method Overriding
class AnimalDemo {
    void sound() {
        System.out.println("Animal can make a sound");
    }
}

class Cat extends AnimalDemo {
    @Override
    void sound() {
        System.out.println("Cat makes a sound Meowwww!!!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Method Overloading Example
        MathOp mo = new MathOp();
        System.out.println("Addition (double): " + mo.add(20.00, 40.00));
        System.out.println("Addition (int): " + mo.add(20, 50));

        System.out.println();

        // Method Overriding Example
        AnimalDemo ad = new AnimalDemo();
        ad.sound(); // parent class method

        Cat c = new Cat();
        c.sound(); // overridden method
    }
}
