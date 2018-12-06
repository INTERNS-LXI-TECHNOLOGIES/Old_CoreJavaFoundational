import java.io.*;
class Writer4
{
	public static void main(String arg[])
	{
		try
		{
			File delDir=new File("deldir");
			delDir.mkdir();
			File delFile1=new File(delDir,"delFile1.txt");
			delFile1.createNewFile();
			File delFile2=new File(delDir,"delFile2.txt");
			delFile2.createNewFile();
			delFile1.delete();
			System.out.println("delDir is "+delDir.delete());
			File newName=new File(delDir,"newName.txt");
			delFile2.renameTo(newName);
			File newDir=new File("newDir");
			delDir.renameTo(newDir);
		}
		catch(IOException e)
		{
			
		}
	}
}