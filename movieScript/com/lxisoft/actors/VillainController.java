package com.lxisoft.actors;
import java.util.Scanner;
public class VillainController
{
	private String villainName,villainCharactorName;
	private VillainView villainview;
	private Villain villain=new Villain(villainName,villainCharactorName);
	public VillainController()
	{
		villainDetails();
	}
	public void villainDetails()
	{
		villainview=new VillainView();
		villainview.askVillainName();
		Scanner input=new Scanner(System.in);
		villainName=input.nextLine();
		villainview.askVillainCharactorName();
		villainCharactorName=input.nextLine();
	}
}