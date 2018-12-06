import java.io.*;
class Writer3
{
	public static void main(String arg[])
	{
		try
		{
		File existingDir=new File("existingDir");
		System.out.println(existingDir.isDirectory());
		File existingDirFile=new File(existingDir,"existingDirFile.txt");
		System.out.println(existingDirFile.isFile());
		FileReader fr=new FileReader(existingDirFile);
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
			System.out.println(s);
		br.close();
		}
		catch(IOException e)
		{
			
		}
	}
}