package com.lxisoft.moviescript.actors;
import java.util.Scanner;
public class VillainController
{
	private Villain villain;
	private VillainView villainview;
	private String villainName,villainCharaName;
	public VillainController()
	{
		villainDetail();
	}
	public void villainDetail()
	{
		Scanner input=new Scanner(System.in);
		villainview=new VillainView();
		villainview.askVillainName();
		villainName=input.nextLine();
		villainview.askVillainCharaName();
		villainCharaName=input.nextLine();
		villain=new Villain();
		villain.setVillainName(villainName);
		villain.setVillainCharaName(villainCharaName);
	}
}