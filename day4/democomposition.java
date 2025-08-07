class car
{
	String name,model;
	final engine eng;

	car(String name,String model)
	{
		eng=new engine("power");
		this.name=name;
		this.model=model;
	}
	
	public void display()
	{
		System.out.println("Car: "+name);
		System.out.println("Model: "+model);
		eng.displayeng();
	}

}

class engine
{
	String engine;

	engine(String engine)
	{
		this.engine=engine;
	}
	public void displayeng()
	{
		System.out.println("Engine: "+engine);
	}
}

class democomposition
{
	public static void main(String[] qwe)
	{
		car object=new car("Lexus","aefwejn1214");
		object.display();
	}
}