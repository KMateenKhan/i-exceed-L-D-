interface one
{
    public void methodfromone();

    static void log()
    {
       System.out.println("Static method.");
    }
}
 
interface two
{
    public void methodfromtwo();
   

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
    

}
 
class demointerface2
{
    public static void main(String asd[])
	{
	   sample obj=new sample();
	  
           one.log();// here the method is static
	   
	}
}