class call
{
   synchronized  public void callme(String msg) // ensures only one thread access at a time
	{
      System.out.print("[");
	  System.out.print(msg);
	  System.out.print("]");
	}
  }
 
 
class caller extends Thread
{
    call obj;
    String str;
    Thread t=new Thread(this);
 
    caller(call obj,String str)
	{
	   this.str=str;
	   this.obj=obj;
	   t.start();
	}
 
    public void run()
	{
	   obj.callme(str);
	}
}
 
class demosync
{
    public static void main(String asd[])
	{
	   call obj=new call();
       caller c1=new caller(obj,"hello"); // three caller objects are created
	   caller c2=new caller(obj,"hi");
	   caller c3=new caller(obj,"welcome"); 
   	}

  }
