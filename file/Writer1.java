import java.io.*;
class Writer1
{
	public static void main(String arg[])
	{
		try
		{
			boolean newFile=false;
			File file=new File("filewriter1.txt");
			System.out.println(file.exists());
			newFile=file.createNewFile();
			System.out.println(newFile);
			System.out.println(file.exists());
		}
		catch(IOException e)
		{
			
		}
	}
}

//output:
//for first execution
//false
//true
//true

//for second execution
//true
//false
//true