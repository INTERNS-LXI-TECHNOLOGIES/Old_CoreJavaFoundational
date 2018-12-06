import java.io.*;
class Directory1
{
	public static void main(String arg[])
	{
		try
		{
			File myDir=new File("mydir");
			myDir.mkdir();
			File myFile=new File(myDir,"myfile.txt");
			myFile.createNewFile();
			System.out.println(myFile.isFile());
			FileReader fr=new FileReader(myFile);
			BufferedReader br=new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
				System.out.println(s);
			br.close();
			PrintWriter pw=new PrintWriter(myFile);
			pw.println("new stuff");
			pw.flush();
			pw.close();
		}
		catch(IOException e)
		{
			
		}
	}
}