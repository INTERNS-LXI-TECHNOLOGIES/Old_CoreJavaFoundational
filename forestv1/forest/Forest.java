package com.lxisoft.forestv1.forest;
import com.lxisoft.forestv1.forest.animals.Animal;
import com.lxisoft.forestv1.forest.animals.Tiger;
import com.lxisoft.forestv1.forest.animals.Bear;
import com.lxisoft.forestv1.forest.animals.Lion;
import java.util.ArrayList;
public class Forest
{
	private ArrayList <Animal> animals;
	private Tiger tigers;
	private Lion lions;
	private Bear bears;
	public void setAnimals(ArrayList <Animal> animals)
	{
		this.animals=animals;
	}
	public ArrayList <Animal> getAnimals()
	{
		return animals;
	} 
	
	public void setTigers(Tiger tigers)
	{
		this.tigers=tigers;
	}
	public Tiger getTigers()
	{
		return tigers;
	}
	public void setLions(Lion lions)
	{
		this.lions=lions;
	}
	public Lion getLions()
	{
		return lions;
	}
	public void setBears(Bear bears)
	{
		this.bears=bears;
	}
	public Bear getBears()
	{
		return bears;
	}
	
	public void forestDetails()
	{
		int random1 =(int)(Math.random()*3);
		int random2 =(int)(Math.random()*3);
		setAnimals(new ArrayList <Animal>());
	getAnimals().add(new Tiger());
	getAnimals().add(new Lion());
	getAnimals().add(new Bear());
	getAnimals().get(0).setName("Tiger");
	getAnimals().get(1).setName("Lion");
	getAnimals().get(2).setName("Bear");

/*if(getAnimals().get((int)(Math.random()*3)).getStrength()getAnimals().get((int)(Math.random()*3)).getStrength())
{
	System.out.println("Both animals are same");
}
if(getAnimals().get((int)(Math.random()*3)).getStrength()!=getAnimals().get((int)(Math.random()*3)).getStrength())
{*/
		 int animStrength1=getAnimals().get(random1).strength();
		 int animStrength2=getAnimals().get(random2).strength();
		System.out.println(getAnimals().get(random1).getName()+" Strength:"+animStrength1);
		System.out.println(getAnimals().get(random2).getName()+" Strength:"+animStrength2);
		if(animStrength1>animStrength2)
		{
			
			System.out.println(getAnimals().get(random1).getName()+" wins");
		}
		else
		{
			System.out.println(getAnimals().get(random2).getName()+" wins");
		}
}
	
}