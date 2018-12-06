import java.io.*;
class Writer2
{
	public static void main(String arg[])
	{
		char[] in=new char[50];
		int size=0;
		try
		{
			File file=new File("fileWriter2.txt");
			FileWriter fw=new FileWriter(file);
			fw.write("howdy\nfolks\n");
			fw.flush();
			fw.close();
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