class sample extends Thread
{
     Thread t=new Thread(this);
     //Thread t =Thread.currentThread();
     public void run()
	{
	   for(var i=0;i<10;i++)
		{
		    try{
			System.out.println( i + t.getName() );
			t.sleep(250);
			}catch(InterruptedException d){}
		}
	}
	public void display()
	{
	    for(var i=0;i<10;i++)
		{
			System.out.println("Display: " +i );
	
		}
	}
}
 
 
class demothread7
{
    public static void main(String asd[]) throws InterruptedException
	{
	     sample obj1=new sample();
	     sample obj2=new sample();
	     sample obj3=new sample();
 	     System.out.println(Thread.currentThread());
	     obj1.start();
       obj1.display(); // this is executed first then the thread follows
	}
}
