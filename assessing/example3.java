class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
}

public class example3 {
    public static void main(String[] args) {
        new B();
        // Calls B() constructor
        // Before executing B()'s body, it implicitly calls super(), which is A() in this case
    }
}
