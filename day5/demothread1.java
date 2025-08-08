class sample extends Thread
{
	public void run()
	{
		System.out.println("Run method");
	}
}

class demothread1
{
	public static void main(String[] qwe)
	{
		sample obj=new sample();
		obj.start();
		//obj.start(); cannot call run method more than once from same object
		
		sample obj2=new sample();
		obj2.start();
		
	}
}
