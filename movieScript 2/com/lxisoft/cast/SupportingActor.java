package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class SupportingActor
{
	private String supportingActorName;
	Properties p=new Properties();
	public SupportingActor()throws Exception
	{
		supportingActorDetails();
	}
	public void supportingActorDetails()throws Exception
	{
		
		Scanner input=new Scanner(System.in);
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
}
