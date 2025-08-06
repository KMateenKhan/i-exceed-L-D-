interface one
{
    public void methodfromone();

    default void log() // possible from version 8 of java
    {
	System.out.println("Default");
    }
}
 
interface two extends one
{
    public void methodfromtwo();
}
 
class sample implements two
  {
   
    @Override
     public void methodfromone(){
	 System.out.println("method from interface one");
	}
 
    @Override
     public void methodfromtwo(){
	System.out.println("method from interface two");
	}
    @Override
     public void log(){
	System.out.println("Default overridden.");
	}

}
 
class demointerface
{
    public static void main(String asd[])
	{
	   sample obj=new sample();
	   obj.methodfromone();
	   obj.methodfromtwo();	
	   obj.log();
	}
}