package com.lxisoft.moviescript.actors;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ComedianController
{
	private Comedian comedian;
	private ComedianView comedianview;
	private String comedianName,comedCharaName;
	public ComedianController()
	{
		comedianDetail();
	}
	public void comedianDetail()
	{
		try
		{
		File comedfile=new File("./com/lxisoft/moviescript/file/comedian.txt");
		FileWriter fwcomed=new FileWriter(comedfile); 
		Scanner input=new Scanner(System.in);
		comedianview=new ComedianView();
		comedianview.askComedianName();
		comedianName=input.nextLine();
		fwcomed.write(comedianName);
		String newLine=("\n");
		fwcomed.write(newLine);
		comedianview.askComedCharaName();
		comedCharaName=input.nextLine();
		fwcomed.write(comedCharaName);
		fwcomed.close();
		comedian=new Comedian();
		comedian.setComedianName(comedianName);
		comedian.setComedCharaName(comedCharaName);
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
	}
}