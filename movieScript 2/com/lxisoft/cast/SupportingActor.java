package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class SupportingActor
{
	private String supportingActorName,dialogue;
	Scanner input=new Scanner(System.in);
	Properties p=new Properties();
	Random r=new Random();
	int ran=r.nextInt(20);
	public SupportingActor()throws Exception
	{
		supportingActorDetails();
	}
	public void supportingActorDetails()throws Exception
	{
		
		
		System.out.println("Enter the supporting actor Name:");
		supportingActorName=input.nextLine();
		p.setProperty("supportingActor",supportingActorName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/SupportingActor/"+supportingActorName+".properties"),"inserted");
		
	}
	public void supportingActorDataView() throws Exception
	{
		
		FileReader reader=new FileReader("com/lxisoft/cast/castdata/SupportingActor/"+supportingActorName+".properties");
		p.load(reader);
		System.out.println(("SupportingActor:")+p.getProperty("supportingActor"));
	}
	public void addSupportingActorDialogue() throws Exception
	{
		System.out.println("Enter the Dialogue of Supporting Actor:");
		dialogue=input.nextLine();
		p.setProperty("Dialogue"+ran+"",dialogue);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/SupportingActor/"+supportingActorName+".properties"),"inserted");
	
	}
	public void viewSupportingActorDialogue() throws Exception
	{
		FileReader reader=new FileReader("com/lxisoft/cast/castdata/SupportingActor/"+supportingActorName+".properties");
		p.load(reader);
		System.out.println(("Hero:")+p.getProperty("Dialogue"+ran+""));
	}
}