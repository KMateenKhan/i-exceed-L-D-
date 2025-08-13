import java.io.*;

class Fiscom
{
	public static void main(String[] qwe) throws Exception
	{
		FileOutputStream fout=new FileOutputStream("sample3.txt");
		String str="new content in the file's";
		byte bstr[]=str.getBytes();
		fout.write(bstr);
		
		FileInputStream fin=new FileInputStream("sample3.txt");
		int i=0;

		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
		fout.close();
		fin.close();

		
	}
}
