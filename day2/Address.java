class Address
{
	// this class is aggregated to the demo file
	
	// instance variables
	int plot;
	String location;

	// constructor
	Address(int plot,String location  )
	{
		this.plot=plot;
		this.location=location;
	}
	// method
	public void display()
	{
		System.out.println("Plot number:"+plot);
		System.out.println("Location:"+location);
	}


}
