import java.util.*;
 
class arrayList {
 
   public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<String> names= new ArrayList <String> ();

	      names.add("adam");
	      names.add("bilal");
	      names.add("danish");
 
        // Access element from the list
        String name = names.get(3);
        System.out.println("Accessed Element: " + name);
 
        // Remove element from the list
        names.remove("bilal");
        System.out.println("After Removed name: " + names);
   }
}
