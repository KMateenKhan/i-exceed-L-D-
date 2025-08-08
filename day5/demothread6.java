class demothread6
{
	public static void main(String[] qwe)
	{
		new Thread(){
			public void run()
			{
				System.out.println("Runnable.");
			}
		}.start();
	}
}