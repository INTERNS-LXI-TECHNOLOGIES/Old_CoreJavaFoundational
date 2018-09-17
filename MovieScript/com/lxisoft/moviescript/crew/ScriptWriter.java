package com.lxisoft.moviescript.crew;
import com.lxisoft.moviescript.person.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import com.lxisoft.moviescript.cast.*;
import com.lxisoft.moviescript.dialogue.Dialogue;
import com.lxisoft.moviescript.exception.RepeatDialogueException;

public class ScriptWriter extends Person
{
	public void writeScript(ArrayList<Hero> hero,ArrayList<Heroine> heroine,ArrayList<SupportingActor> supportingActor,ArrayList<Comedian> comedian,ArrayList<Villain> villain)
	{
		System.out.println("-------------------------------------------------------------------SCRIPT-------------------------------------------------------------------\n\n");
		List<Cast> actors=new ArrayList<Cast>();
		actors.add(getCharacter(hero));
		actors.add(getCharacter(heroine));
		actors.add(getCharacter(comedian));
		actors.add(getCharacter(supportingActor));
		actors.add(getCharacter(villain));
		for(int i=1;i<=5;i++)
		{
			System.out.println("__________________________SCENE "+i+"__________________________\n\n");
			Set<Dialogue> dialogues=new HashSet<Dialogue>();
			//List<String> dialogues= new ArrayList<String>();
			int rand1=(int)(Math.random()*actors.size());
			int rand2;
			do
			{
				rand2=(int)(Math.random()*actors.size());
			}while(rand1==rand2);
			int exchanges=(int)(Math.random()*5)+2;
			while(exchanges!=0)
			{
				Dialogue dialogue1=fetchDialogue(actors.get(rand1),dialogues);
				Dialogue dialogue2=fetchDialogue(actors.get(rand2),dialogues);
				System.out.println(actors.get(rand1).getCharacterName()+" : "+dialogue1+"\n\n\n");
				System.out.println(actors.get(rand2).getCharacterName()+" : "+dialogue2+"\n\n\n");
				exchanges--;
			}
		}
	}
	public Cast getCharacter(List list)
	{
		int size=list.size();
		return (Cast)(list.get((int)(Math.random()*size-1)));
	}
	public Dialogue fetchDialogue(Cast actor,Set<Dialogue>dialogues)
	{
		int size=dialogues.size();
		int currentSize;
		Dialogue dialogue;
		do
		{
			dialogue=actor.getDialogue();
			dialogues.add(dialogue);
			currentSize=dialogues.size();
		}while(currentSize==size);
		return dialogue;
	}
}