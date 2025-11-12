package oopsconcept;

// SINGLE INHERITANCE
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    void showDetails() {
        display();
        System.out.println("Dog Breed: " + breed);
    }
}


// MULTILEVEL INHERITANCE
class GrandParent {
    void gp() {
        System.out.println("Grand Parent class");
    }
}

class Parent extends GrandParent {
    void p() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void child() {
        System.out.println("Child class");
    }
}


// HIERARCHICAL INHERITANCE
class Fruit {
    void show() {
        System.out.println("I like to eat fruits");
    }
}

class Apple extends Fruit {
    void AppleDemo() {
        System.out.println("I like to eat apple");
    }
}

class Grapes extends Fruit {
    void GrapesDemo() {
        System.out.println("I like to eat grapes");
    }
}


// MAIN CLASS
public class Inheritance {
    public static void main(String[] args) {

        // Single Inheritance
        Dog d = new Dog("John", "Siberian Husky");
        d.showDetails();

        System.out.println();

        // Multilevel Inheritance
        Child c = new Child();
        c.child();
        c.p();
        c.gp();

        System.out.println();

        // Hierarchical Inheritance
        Apple a = new Apple();
        a.AppleDemo();
        a.show();

        Grapes g = new Grapes();
        g.GrapesDemo();
        g.show();
    }
}
