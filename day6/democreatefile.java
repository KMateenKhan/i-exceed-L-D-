import java.io.File;
import java.io.FileWriter; 
class democreatefile
{
    public static void main(String asd[]) throws Exception
	{
	  File f=new File("C:/Users/khyrul.mateen/kk/sample.txt");

	  FileWriter fw=new FileWriter("C:/Users/khyrul.mateen/kk/sample.txt");
	  f.createNewFile();
          fw.write("Some random content to be inserted.");
          fw.close();
	  System.out.println("Name: "+f.getName());
          System.out.println("Size: "+f.length());
	  System.out.println(f.isAbsolute());
	  System.out.println(f.getAbsolutePath());
	  boolean ex=f.exists();
	  System.out.println(ex);
	  if(ex)
		{
		   System.out.println("can Read?"+f.canRead());
		   System.out.println("can Write ?"+f.canWrite());
		}
 
	  f.delete();
	  System.out.println("is file is available?\t"+f.exists());
	}
}