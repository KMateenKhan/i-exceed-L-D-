import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ByteArrayInputStream;
class demoBAOS
{
   public static void main(String asd[])throws Exception
	{
	   ByteArrayOutputStream bos=new ByteArrayOutputStream();
 
	   bos.writeBytes("this is the sample string to be embed into multiple source".getBytes());
 
	   FileOutputStream fous1=new FileOutputStream(new File("byte_array1.txt"));
	   FileOutputStream fous2=new FileOutputStream(new File("byte_array2.txt"));
	   bos.writeTo(fous1);
	   bos.writeTo(fous2);
	   fous1.close();
	   fous2.close();
	   ByteArrayOutputStream bos1=new ByteArrayOutputStream();
 
	   bos.writeBytes("this is the second sample string to be embed into multiple source".getBytes());
 
	   FileOutputStream fous3=new FileOutputStream(new File("byte_array3.txt"));
	   FileOutputStream fous4=new FileOutputStream(new File("byte_array4.txt"));
	   bos1.writeTo(fous3);
	   bos1.writeTo(fous4);
	   fous1.close();
	   fous2.close();

	   FileInputStream fin=new FileInputStream("byte_array2.txt");
           byte[] x=fin.readAllBytes();
	   fin.close();
	   ByteArrayInputStream bis=new ByteArrayInputStream(x);
	   
           int i=0;
	   while((i=bis.read())!=-1)
		  {
   		     System.out.print((char)i);
		  }
	   
           

	}
}