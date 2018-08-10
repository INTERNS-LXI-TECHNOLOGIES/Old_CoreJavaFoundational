package com.lxisoft.moviescript.actors;
import java.util.Scanner;
public class VillainController
{
	private Villain villain;
	private VillainView villainview;
	private String villainName;
	public VillainController()
	{
		villainDetail();
	}
	public void villainDetail()
	{
		Scanner input=new Scanner(System.in);
		villainview=new VillainView();
		villainview.askName();
		villainName=input.nextLine();
		villain=new Villain();
		villain.setVillainName(villainName);
	}
}