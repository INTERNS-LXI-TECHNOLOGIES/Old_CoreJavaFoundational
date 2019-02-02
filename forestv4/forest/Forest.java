package com.lxisoft.forestv4.forest;
import com.lxisoft.forestv4.forest.animals.Animal;
import com.lxisoft.forestv4.forest.animals.carnivores.*;
import com.lxisoft.forestv4.forest.animals.herbivores.*;
import java.util.ArrayList;
public class Forest
{
	private ArrayList <Animal> animals;
	public void setAnimals(ArrayList <Animal> animals)
	{
		this.animals=animals;
	}
	public ArrayList <Animal> getAnimals()
	{
		return animals;
	} 
	public void forestDetails()
	{

		
		setAnimals(new ArrayList <Animal>());
		
		int j=0;
	for(int i=0;i<5;i++)
	{		
	getAnimals().add(new Tiger());
	getAnimals().add(new Lion());
	getAnimals().add(new Bear());
	getAnimals().add(new Deer());
	getAnimals().add(new Rabbit());
	getAnimals().add(new Zebra());
	
	getAnimals().get(j).setName("Tiger"+(i+1));
	getAnimals().get(j+1).setName("Lion"+(i+1));
	getAnimals().get(j+2).setName("Bear"+(i+1));
	getAnimals().get(j+3).setName("Deer"+(i+1));
	getAnimals().get(j+4).setName("Rabbit"+(i+1));
	getAnimals().get(j+5).setName("Zebra"+(i+1));
	j=j+6;
	}
	for(Animal animalfight:animals)
	{
		int random1 =(int)(Math.random()*30);
		int random2 =(int)(Math.random()*30);
		 int animStrength1=getAnimals().get(random1).strength();
		 int animStrength2=getAnimals().get(random2).strength();
		 int anim1Locationx=getAnimals().get(random1).locationx();
		 int anim1Locationy=getAnimals().get(random1).locationy();
		 int anim2Locationx=getAnimals().get(random2).locationx();
		 int anim2Locationy=getAnimals().get(random2).locationy();
		 
		if((getAnimals().get(random1) instanceof Carnivore&&getAnimals().get(random2) instanceof Carnivore)||(getAnimals().get(random1) instanceof Carnivore&&getAnimals().get(random2) instanceof Herbivore)||(getAnimals().get(random1) instanceof Herbivore&&getAnimals().get(random2) instanceof Carnivore))
		{
		if(Math.abs(anim1Locationx-anim2Locationx)<10&&Math.abs(anim1Locationy-anim2Locationy)<10)
		{
		if(animStrength1>animStrength2)
		{
			
			System.out.println(getAnimals().get(random1).getName()+" Strength:"+animStrength1+" Location x:"+anim1Locationx+" Location y:"+anim1Locationy);
		 System.out.println(getAnimals().get(random2).getName()+" Strength:"+animStrength2+" Location x:"+anim2Locationx+" Location y:"+anim2Locationy);
		 System.out.println("////////////Fighting////////////");
		 if(getAnimals().get(random1) instanceof Herbivore)
		 {
			((Herbivore)getAnimals().get(random1)).checkLuck();
			
		 }
		 else if(getAnimals().get(random2) instanceof Herbivore)
		 {
			
			((Herbivore)getAnimals().get(random2)).checkLuck();
			
		 }
		 else
		 {
			System.out.println(getAnimals().get(random1).getName()+" wins");
		 }
		}
		else if(animStrength1<animStrength2)
		{
			System.out.println(getAnimals().get(random1).getName()+" Strength:"+animStrength1+" Location x:"+anim1Locationx+" Location y:"+anim1Locationy);
		  System.out.println(getAnimals().get(random2).getName()+" Strength:"+animStrength2+" Location x:"+anim2Locationx+" Location y:"+anim2Locationy);
		  System.out.println("////////////Fighting////////////");
			System.out.println(getAnimals().get(random2).getName()+" wins");
		}
		}
			
		}
		/*else
		{
			System.out.println("The animals are far");
		}*/
	}
		
}
	
}