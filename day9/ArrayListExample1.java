import java.util.*;
import java.util.ArrayList;
 
public class ArrayListExample1 
{
  public static void main(String[] args)
  {
    ArrayList<String> listOfNames = new ArrayList<String>();
 
    listOfNames.add("Australia");
    listOfNames.add("Brazil");
    listOfNames.add("Cuba");
    listOfNames.add("Denmark");

    System.out.println("Before remove method list: "+listOfNames);

    boolean isRemovedSucessfully = listOfNames.remove("Cuba");
    System.out.println("Is element is removes successfully = "+isRemovedSucessfully);

    //  This element doesn't exists
    isRemovedSucessfully = listOfNames.remove("JS"); 
    System.out.println("Is element is removes successfully = "+isRemovedSucessfully);

    System.out.println("After remove method list: "+listOfNames);

    //listOfNames.removeAll(listOfNames);// removes all the elements
    //System.out.println("After removeAll method list: "+listOfNames);
   

    //Accessing the elements
    ListIterator<String> lis= listOfNames.listIterator(); 

    System.out.println("From order");
        while(lis.hasNext())
        {
            System.err.println(lis.next());
        }
    System.out.println("******************");
        while(lis.hasPrevious())
        {
            System.out.println(lis.previous());
        }

     //other accessing methods
     
     System.out.println("Element accessing:");
     for(String x: listOfNames)
	{
		System.out.println(x);
	}

     System.out.println("For Each:");
     listOfNames.forEach(x->System.out.println(x.toUpperCase()));
  }
}