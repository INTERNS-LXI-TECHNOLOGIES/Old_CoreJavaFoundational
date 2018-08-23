package com.lxisoft.actors;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
//import java.io.BufferedWriter;
import java.io.IOException;
public class ComedianController
{
	private String comedianName,comedianCharactorName;
	private ComedianView comedianview;
	private Comedian comedian;
	public ComedianController()
	{
		comedianDetails();
	}
	public void comedianDetails()
	{
		try
		{
		File comedianfile=new File("./com/lxisoft/file/Comedian.txt");
		FileWriter comedianfw=new FileWriter(comedianfile);
		Scanner input=new Scanner(System.in);
		comedianview=new ComedianView();
		comedianview.askComedianName();
		comedianName=input.nextLine();
		comedianfw.write(comedianName);
		String newLine=("\n");
		comedianfw.write(newLine);
		comedianview.askComedianCharactorName();
		comedianCharactorName=input.nextLine();
		comedianfw.write(comedianCharactorName);
		comedianfw.close();
		comedian=new Comedian(comedianName,comedianCharactorName);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}