class student
{
	String name,dept;
	Address adr;
	Marks mk;
	student(String name,String dept,Address adr,Marks mk)
	{
		this.name=name;
		this.dept=dept;
		this.adr=adr;
		this.mk=mk;
		System.out.println(this);	
	}
	public void display()
	{
		System.out.println(name);
		adr.display();
		System.out.println(adr.plot);
		mk.display();
	}

}

class demo
{
	public static void main(String[] as)
	{
		Address a1=new Address(4324324,"kormangala");
		//dress a=new Address(4324,"korm");
		Marks m=new Marks(45,false);
		System.out.println("address object ref:"+a1);
		student st=new student("Danish","III",a1,m);
		System.out.println("student object ref:"+st);
		st.display();
		
		
	}
}
