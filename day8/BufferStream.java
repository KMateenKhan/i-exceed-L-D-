import java.io.*;
import java.util.Scanner;

class BufferStream
{
	public static void main(String[] qwe) throws Exception
	{
 		Scanner sc=new Scanner(System.in);
                System.out.println("Implementing the bufferedStream");
		System.out.println("Enter the file name: ");
		String file_name=sc.nextLine();
		BufferedOutputStream bout=new BufferedOutputStream( new FileOutputStream(file_name));

		System.out.println("Enter the file contents: ");
		String file_content=sc.nextLine();

		//String str="new content in the file's";
		byte bstr[]=file_content.getBytes();
		bout.write(bstr);
		bout.close();
		BufferedInputStream bin=new BufferedInputStream(new FileInputStream(file_name));
		int i=0;
		System.out.println("File contents: ");
		while((i=bin.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	

		
	}
}