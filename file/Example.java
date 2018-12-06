import java.io.*;
class Example
{
	public static void main(String arg[])
	{
		try
		{
			File readFile=new File("readfile.txt");
			FileReader fr=new FileReader(readFile);
			BufferedReader br=new BufferedReader(fr);
			
			String s=br.readLine();
			
			File writeFile=new File("writefile.txt");
			writeFile.createNewFile();
			FileWriter fw=new FileWriter(writeFile);
			BufferedWriter bw=new BufferedWriter(fw);
			while(s!=null)
			{
				bw.write(s);
				bw.newLine();
				System.out.println(s);
				s=br.readLine();
			}
			bw.flush();
			bw.close();
			
			
		}
		catch(IOException e)
		{
			
		}
	}
}