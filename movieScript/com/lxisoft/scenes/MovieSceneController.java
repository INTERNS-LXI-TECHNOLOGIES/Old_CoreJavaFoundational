package com.lxisoft.scenes;
import com.lxisoft.actors.*;
import java.io.*;
public class MovieSceneController
{
	public MovieSceneController()
	{
		titleScene();
	}
	public void titleScene()
	{
		try
		{
			FileReader fr= new FileReader("./com/lxisoft/file/MovieScript.txt");
			FileReader fr1= new FileReader("./com/lxisoft/file/Hero.txt");
			FileReader fr2= new FileReader("./com/lxisoft/file/Heroine.txt");
			//FileReader fr= new FileReader("./com/lxisoft/file/Comedian.txt");
			//FileReader fr= new FileReader("./com/lxisoft/file/Villain.txt");
			BufferedReader br= new BufferedReader(fr);
			BufferedReader br1= new BufferedReader(fr1);
			BufferedReader br2= new BufferedReader(fr2);
			
			//StringBuffer stringBuffer = new StringBuffer();
			String movie,hero,heroine;
			int fr1lineNo=1;int lineNo=1;
			while((movie=br.readLine()) != null)
			{
			System.out.println(movie);
			}
			if(fr1lineNo==1)
			{
				hero=br1.readLine();
				System.out.println("Hero :"+hero);
			}
			else
			{
				br1.readLine();
			}
			if(lineNo==1)
			{
				heroine=br2.readLine();
				System.out.println("Heroine :"+heroine);
			}
			else
			{
				br2.readLine();
			}
			
			
			fr.close();
			fr1.close();
			fr2.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}