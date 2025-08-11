class A {
    void display() { System.out.print("A"); }
}

class B extends A {
    void display() { System.out.print("B"); }
}

class C extends B {
    void display() {
        super.display();       // Calls B's display()
        System.out.print("C"); // Then prints "C"
    }
}

public class example2 {
    public static void main(String[] args) {
        A obj = new C();       // Reference of type A, object of type C
        obj.display();         // C's display()
    }
}
