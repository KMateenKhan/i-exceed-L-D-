class one extends Thread
  {
     public void run()
	{
	  for(var i=0;i<50;i++)
		{
	    System.out.println(Thread.currentThread().getName()+"-iteration"+i);
		  Thread.yield(); // pauses the current execution of thread to execute other thread's
		 }
         }
   }

class two extends Thread
  {
     public void run()
	{
	  for(var i=0;i<50;i++)
		{
	      System.out.println(Thread.currentThread().getName()+"-iteration"+i);
		  //Thread.yield();
		 }
         }
   }
 
 
class demothreadyield
{
    public static void main(String asd[])
	{
	   one obj1=new one();
	   two obj2=new two();
	   obj1.start();
	   obj2.start();
	  
	}  
}
