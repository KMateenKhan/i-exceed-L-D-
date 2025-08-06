class Address
{
	int plot;
	String location;
	Address(int plot,String location  )
	{
		this.plot=plot;
		this.location=location;
	}
	public void display()
	{
		System.out.println("Plot number:"+plot);
		System.out.println("Location:"+location);
	}

}