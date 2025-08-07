// You cannot avoid constructor call if you instantiate the object.
// To avoid constructor call entirely:
  // Don’t create any objects, even inside static methods.
  // Only access static members directly.

class sample
{
    int x = 10;
    static int y = 20;

    sample()
    {
        System.out.println("Constructor is called.");
    }

    public void display()
    {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    static void display1()
    {
        // Cannot access non-static x here without creating an object
        // So let's only access static y
        System.out.println("y = " + y);
    }
}

class democonstructor
{
    public static void main(String fas[])
    {
        sample.display1(); // Now no constructor call happens at all
    }
}
