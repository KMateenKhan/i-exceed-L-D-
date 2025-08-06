class Marks
{
	int percent;
	boolean pass;
	
	Marks(int percent,boolean pass)
	{
		this.percent=percent;
		this.pass=pass;
	}
	public void display()
	{
		System.out.println("Percentage:"+percent);
		System.out.println("Result:"+pass);
	}
}
