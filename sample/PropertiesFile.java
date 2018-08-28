import java.io.*;
import java.util.*;
public class PropertiesFile
{
	public static void main(String args[])throws Exception
	{
		Properties p=new Properties();
		p.setProperty("MovieScript","Director");
		p.store(new FileWriter("Movie"),"Details");
		FileReader reader=new FileReader("Movie");
		p.load(reader);
		System.out.println(p.getProperty("MovieScript"));
	}
}