package com.lxisoft.moviescript.actors;
import java.util.Scanner;
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
		Scanner input=new Scanner(System.in);
		comedianview=new ComedianView();
		comedianview.askComedianName();
		comedianName=input.nextLine();
		comedianview.askComedCharaName();
		comedCharaName=input.nextLine();
		comedian=new Comedian();
		comedian.setComedianName(comedianName);
		comedian.setComedCharaName(comedCharaName);
		
	}
}