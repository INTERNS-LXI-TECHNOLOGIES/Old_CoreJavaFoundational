package com.lxisoft.actors;
import java.util.Scanner;
public class VillianController
{
	private String villianName,villianCharactorName;
	private VillianView villianview;
	private Villian villian=new Villian(villianName,villianCharactorName);
	public VillianController()
	{
		villianDetails();
	}
	public void villianDetails()
	{
		villianview=new VillianView();
		villianview.askVillianName();
		Scanner input=new Scanner(System.in);
		villianName=input.nextLine();
		villianview.askVillianCharactorName();
		villianCharactorName=input.nextLine();
	}
}