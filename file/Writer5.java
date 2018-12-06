import java.io.*;
class Writer5
{
	public static void main(String arg[])
	{
		char[] in=new char[50];
		int size=0;
		try
		{
			File file=new File("fileWriter2.txt");
			FileWriter fw=new FileWriter(file);
			PrintWriter pw=new PrintWriter(fw);
			pw.write("howdy\nfolks\n");
			pw.flush();
			pw.close();
			FileReader fr=new FileReader(file);
			size=fr.read(in);
			System.out.print(size+"");
			for(char c:in)
				System.out.print(c);
			fr.close();
		}
		catch(IOException e)
		{
		}
	}
}