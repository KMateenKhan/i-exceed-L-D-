class sample extends Thread
{ 
    Thread t=new Thread(this);
    //Thread t=Thread.currentThread(); // this can also be used
    public void run()
	{
	  t.setName("i-exceed thread");
	  t.setName("i-exceed");
	  System.out.println("Name in run method:\t"+t.getName());
	}
}
 
 
class demothread3
{
    public static void main(String asd[])
	{
	  Thread th=Thread.currentThread();
	  // Thread th=new Thread(); // gives thread-name as Thread-0
	  System.out.println("Name in Main method:\t"+th.getName());
	  sample obj=new sample();
	  obj.start();
	} 
}