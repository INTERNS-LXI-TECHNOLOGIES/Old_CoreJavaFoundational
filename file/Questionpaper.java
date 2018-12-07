import java.io.*;
import java.util.*;
 class Questionpaper
{
	public static void main(String arg[])
	{
		try
		{
			File quizFile=new File("quizfile.csv");
			FileReader fr=new FileReader(quizFile);
			BufferedReader br=new BufferedReader(fr);
			
			String s=br.readLine();
			
			File answerFile=new File("answerFile.csv");
			answerFile.createNewFile();
			FileWriter fw=new FileWriter(answerFile);
			BufferedWriter bw=new BufferedWriter(fw);
			while(s!=null)
			{
				String stringarray[]=s.split(",");
				for(String temp:stringarray)
				System.out.println(temp);
				System.out.println("Enter your answer:\n");
				Scanner sc=new Scanner(System.in);
				String readAnswer=sc.nextLine();

					bw.write(readAnswer);
					
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