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
}
 
 
class demothreadjoin
{
    public static void main(String asd[]) throws InterruptedException
	{
	     sample obj1=new sample();
	     sample obj2=new sample();
	     sample obj3=new sample();
 	     System.out.println(Thread.currentThread());
	     obj1.start();
	     obj1.join(); // doesn't allow other thread's start            

	     obj2.start();
	     obj2.join();
 
	     obj3.start();
	     obj3.join();
 
	}
}