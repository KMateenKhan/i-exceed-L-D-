class sample extends Thread

{

    public void run()

	{

	  for(var i=0;i<10;i++)

	   {

	     try{

	          System.out.println("Thread:"+i);

	          new Thread(this).sleep(500);

	     }catch(Exception d){}

	   }
 
	}

}
 
class demothread5

{

    public static void main(String ads[]) 

	{

	   sample obj=new sample();

	   obj.start();

	   for(var i=0;i<10;i++)

		{	
		  try{
		   System.out.println("Main:"+i);

		   Thread.currentThread().sleep(250);
                    }catch(InterruptedException d){}

		}
 
	}

}
 