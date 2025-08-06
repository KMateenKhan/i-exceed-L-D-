interface one
{
    public void methodfromone();

    default void log() // possible from version 8 of java
    {
	System.out.println("Default in interface1");
    }
}
 
interface two
{
    public void methodfromtwo();
    default void log() // possible from version 8 of java
    {
	System.out.println("Default in interface2");
    }

}

 
class sample implements one,two
  {
   
    @Override
     public void methodfromone(){
	 System.out.println("method from interface one");
	}
    @Override
     public void methodfromtwo(){
	 System.out.println("method from interface two\n");
	}
    @Override
     public void log(){
	System.out.println("Default overridden in sample class.");
    
        //to execute the log() of the interfaces
	one.super.log();
        two.super.log();
	}

}
 
class demointerface1
{
    public static void main(String asd[])
	{
	   sample obj=new sample();
	   obj.log();// executes the log() in sample class
           
           
           //one.super.log(); gives error here
	}
}