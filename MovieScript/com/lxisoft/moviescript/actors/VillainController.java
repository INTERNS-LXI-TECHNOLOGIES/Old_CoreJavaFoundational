package com.lxisoft.moviescript.actors;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
		try
		{
		File villainfile=new File("./com/lxisoft/moviescript/file/villain.txt");
		FileWriter fwvillain=new FileWriter(villainfile); 
		Scanner input=new Scanner(System.in);
		villainview=new VillainView();
		villainview.askVillainName();
		villainName=input.nextLine();
		fwvillain.write(villainName);
		String newLine=("\n");
		fwvillain.write(newLine);
		villainview.askVillainCharaName();
		villainCharaName=input.nextLine();
		fwvillain.write(villainCharaName);
		fwvillain.close();
		villain=new Villain();
		villain.setVillainName(villainName);
		villain.setVillainCharaName(villainCharaName);
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
	}
}