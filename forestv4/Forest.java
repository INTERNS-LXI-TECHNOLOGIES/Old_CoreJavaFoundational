package com.lxisoft.forestv4;
import com.lxisoft.forestv4.animal.Animal;
import com.lxisoft.forestv4.animal.*;
import java.util.ArrayList;
public class Forest
{
	private ArrayList <Animal> animals;
	private Hunter hunter;
	public void setAnimals(ArrayList <Animal> animals)
	{
		this.animals=animals;
	}
	public ArrayList <Animal> getAnimals()
	{
		return animals;
	} 
	public void setHunter(Hunter hunter)
	{
		this.hunter=hunter;
	}
	public Hunter getHunter()
	{
		return hunter;
	}
	public void animalFight()
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
		int r=1;
		int meters=60;
		do
		{
			if(meters>10){
			meters =meters-10;
			}
			
			System.out.println("   ***Fight on forest round"+r+"***");	
			r++;
		for(Animal anim:animals)
		{ 
		anim.setLocationx((int)(Math.random()*(meters)));
		anim.setLocationy((int)(Math.random()*(meters)));
		anim.setStrength((int)(Math.random()*100));
		}
		//hunter.setLocationx((int)(Math.random()*(meters)));
		//hunter.setLocationy((int)(Math.random()*(meters)));
		for(int l=0;l<animals.size();l++)
		{
			int random1 =(int)(Math.random()*animals.size()-1);
		if(animals.get(random1).getLocationx()>0&&animals.get(l).getLocationx()>0&&animals.get(random1).getLocationy()>0&&animals.get(l).getLocationy()>0)
		{	
		if(Math.abs((animals.get(random1).getLocationx())-(animals.get(l).getLocationx()))<10&&Math.abs((animals.get(random1).getLocationy())-(animals.get(l).getLocationy()))<10)
		{	
		 if(animals.get(random1) instanceof Herbivore&&animals.get(l) instanceof Carnivore)
		 {
			
		//System.out.println(animals.get(random1).getName()+" Strength:"+animals.get(random1).getStrength()+" Location x:"+animals.get(random1).getLocationx()+" Location y:"+animals.get(random1).getLocationy());
		//System.out.println(animals.get(l).getName()+" Strength:"+animals.get(l).getStrength()+" Location x:"+animals.get(l).getLocationx()+" Location y:"+animals.get(l).getLocationy());
			int luckFactor=((Herbivore)animals.get(random1)).checkLuck();
			if(luckFactor>=75)
			{
				//System.out.println("Luck factor:"+luckFactor);
			System.out.println(animals.get(random1).getName()+" escaped from the location");
			}
			else
			{
				if(animals.get(l).eat()<50)
				{
					System.out.println(animals.get(l).getName()+" eats "+animals.get(random1).getName());
					animals.remove(random1);
				
				//System.out.println(animals.get(l).getName()+" wins");
				}
				else
				{
					System.out.println(animals.get(l).getName()+" kills "+animals.get(random1).getName());
					animals.remove(random1);
				}	
			}
			continue;
		 }
		 else if(animals.get(random1) instanceof Carnivore&&animals.get(l) instanceof Herbivore)
		 {
			//System.out.println(animals.get(random1).getName()+" Strength:"+animals.get(random1).getStrength()+" Location x:"+animals.get(random1).getLocationx()+" Location y:"+animals.get(random1).getLocationy());
		  //System.out.println(animals.get(l).getName()+" Strength:"+animals.get(l).getStrength()+" Location x:"+animals.get(l).getLocationx()+" Location y:"+animals.get(l).getLocationy());
			int luckFactor=((Herbivore)animals.get(l)).checkLuck();
			if(luckFactor>=75)
			{
				//System.out.println("Luck factor:"+luckFactor);
			System.out.println(animals.get(l).getName()+" escaped from the location");
			}
			else
			{
				if(animals.get(random1).eat()<50)
				{
					System.out.println(animals.get(random1).getName()+" eats "+animals.get(l).getName());
					animals.remove(l);
				//System.out.println(animals.get(random1).getName()+" wins");
				}
				else
				{
					System.out.println(animals.get(random1).getName()+" kills "+animals.get(l).getName());
					animals.remove(l);
				}
			}
		}
		else if(animals.get(random1) instanceof Carnivore&&animals.get(l) instanceof Carnivore)
		{
		 if(animals.get(random1)!=animals.get(l))
			{
			//System.out.println(animals.get(random1).getName()+" Strength:"+animals.get(random1).getStrength()+" Location x:"+animals.get(random1).getLocationx()+" Location y:"+animals.get(random1).getLocationy());
		    //System.out.println(animals.get(l).getName()+" Strength:"+animals.get(l).getStrength()+" Location x:"+animals.get(l).getLocationx()+" Location y:"+animals.get(l).getLocationy());
			  if(animals.get(random1).getStrength()>animals.get(l).getStrength())
			  {
				System.out.println(animals.get(random1).getName()+" kills "+animals.get(l).getName());
				animals.remove(l);
			  }
			  else 
			  {
			  System.out.println(animals.get(l).getName()+" kills "+animals.get(random1).getName());
				animals.remove(random1);				
			  }
			}
		}
		else if(animals.get(random1) instanceof Herbivore&&animals.get(l) instanceof Herbivore)
		{
			if(animals.get(random1)!=animals.get(l))
			{
			//System.out.println(animals.get(random1).getName()+" Strength:"+animals.get(random1).getStrength()+" Location x:"+animals.get(random1).getLocationx()+" Location y:"+animals.get(random1).getLocationy());
		    //System.out.println(animals.get(l).getName()+" Strength:"+animals.get(l).getStrength()+" Location x:"+animals.get(l).getLocationx()+" Location y:"+animals.get(l).getLocationy());	
			System.out.println("not fighting");
			}
		}
		}
		/*else if(Math.abs((animals.get(random1).getLocationx())-(hunter.getLocationx()))<10&&Math.abs((animals.get(random1).getLocationy())-(hunter.getLocationy()))<10)
		{
			hunter.gun();
			if(hunter.getBullets>0)
			{
			 System.out.println("Hunter hunts "+animals.get(random1).getName());
				animals.remove(random1);
				hunter.getBullets=hunter.getBullets-1;
			}
			else{
				 System.out.println(animals.get(random1).getName()+" kills hunter");
				animals.remove(hunter);	
			}
			
		}*/
		}
		}
		}while(animals.size()>1);

    }
		
}
	
