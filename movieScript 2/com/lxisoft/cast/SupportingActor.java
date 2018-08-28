package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class SupportingActor
{
	private String supportingActorName;
	public SupportingActor()throws Exception
	{
		supportingActorDetails();
	}
	public void supportingActorDetails()throws Exception
	{
		Properties p=new Properties();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the supporting actor Name:");
		supportingActorName=input.nextLine();
		p.setProperty("supportingActor",supportingActorName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/"+supportingActorName+".properties"),"inserted");
		
	}
}
