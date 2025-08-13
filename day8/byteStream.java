import java.io.*;
class employee implements Serializable
{
	String empname;
	int id;
	
	employee(String empname,int id)
	{
		this.empname=empname;
		this.id=id;
	}
	
}

class byteStream 
{
	public static void main(String [] qwe)throws Exception
	{
		employee e1=new employee("Adam",123);
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(new File("emp_data.txt")));
		
		os.writeObject(e1);
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("emp_data.txt"));
		
		employee e=(employee)oi.readObject();
		System.out.println("Name:"+e.empname);
		System.out.println("ID:"+e.id);
	}

}