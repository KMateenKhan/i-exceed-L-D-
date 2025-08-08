class sample extends Thread
{
	Thread th=Thread.currentThread();

	public void run()
	{
		try{
		for(var i=0;i<=5;i++)
		{
		
			System.out.println(i);
			th.sleep(1000);
		}
		}catch(InterruptedException d){}
		System.out.println("Run method");
	}
}

class demothread4
{
	public static void main(String[] qwe)
	{
		sample obj=new sample();
		obj.start();
		//obj.start(); cannot call run method more than once from same object
		
		//sample obj2=new sample();
		//obj2.start();
		
	}
}