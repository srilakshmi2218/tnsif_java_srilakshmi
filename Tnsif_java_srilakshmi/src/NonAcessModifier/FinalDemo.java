package NonAcessModifier;

class FinalDemo {
    final int Var = 100;

    final void display() {
        System.out.println("show the value of Var: " + Var);
    }
}

class Child extends FinalDemo {
    // Cannot override final method, so make new method
    void show() {
        System.out.println("Accessing Var from child: " + Var);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();  // calls parent’s final method
        c.show();     // child’s own method
    }
}
