class company
{
	String city;
	String name;
	
	company(String name,String city)
	{
		this.name=name;
		this.city=city;
	}
	void display()
	{
		System.out.println(city);
	}
}

class hr extends company
{
	
	String hd="kiran";
	hr(String hd)
	{
        super("iexc","kpl");
	this.hd=hd;
	System.out.println("Hr class");
	System.out.println("Name of company:"+name);
	System.out.println(hd);
	}
}

class inher1{
	public static void main(String[] swd)
	{
	
		hr obj=new hr("Kiran");
		obj.display();
	
		
	}

}
