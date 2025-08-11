class customer
{
     int amount=10000;
 
     synchronized public void withdraw(int amount)
	{
	   System.out.println("Going to withdraw");
	   if(this.amount<amount)
		{
		  System.out.println("Less balance wait for deposit:"+this.amount);
		 try{ wait();}catch(Exception  d){} // prempts the deposit method to be executed
		}
		this.amount-=amount;
	   System.out.println("Completed withdraw");

 
	}
 
 
	synchronized public void deposit(int amount)
	{
	   System.out.println("Going to deposit");	   
	   this.amount+=amount;
	   System.out.println("Deposit done:"+this.amount);
	   notify(); // ensures to pass the command back to the withdraw() method
	}
 
}
 
class demoitc
{
    public static void main(String asd[])
	{
	   customer c1=new customer();
	   new Thread()
               {
		 public void run()
		  {
			 c1.withdraw(12000);
	          }
		}.start();
 
	    new Thread()
               {
		    public void run()
			{
   			  c1.deposit(15000);
			}
		}.start();
	}
}