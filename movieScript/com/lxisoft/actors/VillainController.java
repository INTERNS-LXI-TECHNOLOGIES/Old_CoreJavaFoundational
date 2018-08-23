package com.lxisoft.actors;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class VillainController
{
	private String villainName,villainCharactorName;
	private VillainView villainview;
	private Villain villain;
	public VillainController()
	{
		villainDetails();
	}
	public void villainDetails()
	{
		try
		{
		File villainfile=new File("./com/lxisoft/file/Villain.txt");
		FileWriter villainfw=new FileWriter(villainfile);
		Scanner input=new Scanner(System.in);
		villainview=new VillainView();
		villainview.askVillainName();
		villainName=input.nextLine();
		villainfw.write(villainName);
		String newLine=("\n");
		villainfw.write(newLine);
		villainview.askVillainCharactorName();
		villainCharactorName=input.nextLine();
		villainfw.write(villainCharactorName);
		villainfw.close();
		villain=new Villain(villainName,villainCharactorName);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}