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
			BufferedReader br= new BufferedReader(fr);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while((line=br.readLine()) != null)
			{
			
			System.out.println(line);
			
			}
			fr.close();
			System.out.println(stringBuffer.toString());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}