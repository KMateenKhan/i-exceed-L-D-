import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
 
class demoFileReader

  {

    public static void main(String asd[]) throws Exception

	{

           int i=0;

	   File f=new File("C:\\Users\\khyrul.mateen\\kk\\sample3.txt");
 
           FileWriter myWriter = new FileWriter("sample3.txt");
           myWriter.write("Files in Java might be tricky");
           myWriter.close();
   
	   FileReader fo=new FileReader(f);
	   //System.out.println((char)fo.read());// prints the first character of the file
 
	   while((i=fo.read())!=-1) // to read every character as the file is closed with -1

		{
	   	   System.out.print((char)i);

		}
	   fo.close();

	}

}

 