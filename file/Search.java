import java.io.*;
class Search
{
	public static void main(String arg[])
	{
		try
		{
			String[] files=new String[100];
			File search=new File("searchThis");
			search.mkdir();
			File file1=new File(search,"file1.txt");
			file1.createNewFile();
			File file2=new File(search,"file2.txt");
			file2.createNewFile();
			File search1=new File(search,"search1");
			search1.mkdir();
			File search2=new File(search,"search2");
			search2.mkdir();
			files=search.list();
			for(String fn:files)
				System.out.println("found"+fn);
		}
		catch(IOException e)
		{
			
		}
	}
}