import java.io.*;
class Writer6
{
	public static void main(String arg[])
	{
		try
		{
		File file=new File("fileWriter6.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		}
		catch(IOException e)
		{
			
		}
	}
}