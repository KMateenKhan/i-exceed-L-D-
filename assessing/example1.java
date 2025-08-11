class example1.java
  {
  public static void main(String[] qwe)
    {
      String s1 = "java"; // creates string literal with new string pool
      String s2 = new String("java"); // new string object in heap memory
      System.out.println(s1 == s2); // compares the references not the content
      System.out.println(s1.equals(s2)); // compare the content

      System.out.println(s1==s2.intern()); 
      // The intern() method returns a canonical representation of the string. In simpler terms:
      //   It checks if a string with the same content already exists in the String pool.
      //   If it does, it returns the reference from the pool.
      //   If it doesn’t, it adds the string to the pool and returns that reference.
    }
  }
