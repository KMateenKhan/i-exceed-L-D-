// accessing private methods outside class using Java_Reflection

import java.lang.reflect.Method;
 
class sampledemo{
  private String str="welcome";
 
  private void displayPvt()
  {
    System.out.println("Accessing this method outside of the class");
  }
 
 public void display()
  {
	System.out.println("Accessing the public method"); 
  }
 
 // it also works for the public methods

  private void prints()
  {
	System.out.println("Accessing the second private method.");
  }
}
 
class demoaccesspvt
 {
      public static void main(String[] args) throws Exception {

        /* sampledemo obj=new sampledemo();
         obj.displayPvt();  throws error */

        /* Class c=Class.forName("sampledemo");
	 Object obj=c.newInstance();
	 Method m1 = c.getDeclaredMethod("displayPvt");
	 m1.setAccessible(true);
	 m1.invoke(obj);*/


	sampledemo obj=new sampledemo();

	//to search for class "A" and the method "displayPvt"
	Method m=sampledemo.class.getDeclaredMethod("displayPvt");

	//to bypass java access control checks
	m.setAccessible(true);

	//calls the private method "diplayPvt" on object obj
	m.invoke(obj);
      }

 }
