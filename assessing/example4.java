class Base {
    int x = 10;
    void printX() {
        System.out.println("Base x: " + x);
    }
}

class Derived extends Base {
    int x = 20;
    void printX() {
        System.out.println("Derived x: " + x);
    }
}
public class example4 {
    public static void main(String[] args) {
        Base obj = new Derived();
        System.out.println("Base view: " + obj.x);           // 10 - reference type is base
        System.out.println("Derived view: " + ((Derived)obj).x); //20 - cast to derived
    }
}
