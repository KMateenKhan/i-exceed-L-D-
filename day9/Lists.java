import java.util.*;

class link
{
	List lists=new LinkedList();
	link()
	{
		lists.add("a");
		lists.add("b");
		lists.add("c");
		lists.add("d");
		
	Iterator it=lists.iterator();
		
	while(it.hasNext())
	{
		System.out.println(it.next());
	}	
	}
}

class Lists
{
	public static void main(String[] qwe)
	{
		link l = new link();
	}
}