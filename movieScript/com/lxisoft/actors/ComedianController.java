package com.lxisoft.actors;
import java.util.Scanner;
public class ComedianController
{
	private String comedianName,comedianCharactorName;
	private ComedianView comedianview;
	private Comedian comedian=new Comedian(comedianName,comedianCharactorName);
	public ComedianController()
	{
		comedianDetails();
	}
	public void comedianDetails()
	{
		comedianview=new ComedianView();
		comedianview.askComedianName();
		Scanner input=new Scanner(System.in);
		comedianName=input.nextLine();
		comedianview.askComedianCharactorName();
		comedianCharactorName=input.nextLine();
	}
}