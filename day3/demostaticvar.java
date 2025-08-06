class demostaticvar

{

   static int x;
   //int x; the output will always be 1 for all the objects
 
    demostaticvar()

	{

	   x++;

	   System.out.println(x);

	}
 
    public static void main(String asd[])

	{

	   demostaticvar obj1=new demostaticvar();

	   demostaticvar obj2=new demostaticvar();

	   demostaticvar obj3=new demostaticvar();

	}

}
 