package com.lxisoft.moviescript.crew;
import com.lxisoft.moviescript.person.Person;
import java.util.ArrayList;
import com.lxisoft.moviescript.cast.*;

public class ScriptWriter extends Person
{
	public void writeScript(ArrayList<Hero> hero,ArrayList<Heroine> heroine,ArrayList<SupportingActor> supportingActor,ArrayList<Comedian> comedian,ArrayList<Villain> villain)
	{
		System.out.println("-------------------------------------------------------------------SCRIPT-------------------------------------------------------------------");
		ArrayList<Cast> actors=new ArrayList<Cast>();
		actors.add(getCharacter(hero));
		actors.add(getCharacter(heroine));
		actors.add(getCharacter(comedian));
		actors.add(getCharacter(supportingActor));
		actors.add(getCharacter(villain));
		for(int i=1;i<=5;i++)
		{
			System.out.println("__________________________SCENE "+i+"__________________________");
			int rand1=(int)(Math.random()*actors.size());
			int rand2;
			do
			{
				rand2=(int)(Math.random()*actors.size());
			}while(rand1==rand2);
			int repeat=(int)(Math.random()*5)+2;
			while(repeat!=0)
			{
				System.out.println(actors.get(rand1).getCharacterName()+" : "+actors.get(rand1).getDialogue()+"\n\n\n");
				System.out.println(actors.get(rand2).getCharacterName()+" : "+actors.get(rand2).getDialogue()+"\n\n\n");
				repeat--;
			}
		}
	}
	public Cast getCharacter(ArrayList list)
	{
		int size=list.size();
		return (Cast)(list.get((int)(Math.random()*size-1)));
	}	
}