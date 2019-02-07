package com.lxisoft.forestv4;
import com.lxisoft.forestv4.animal.Animal;
import com.lxisoft.forestv4.animal.*;
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
		int meters=50;
		for(int i=0;i<animals.size();i++)
		{
			System.out.println("   ***Fight on forest round"+r+"***");	
			r++;
		for(Animal anim:animals)
		{ 
		anim.setLocationx((int)(Math.random()*(meters-10)));
		anim.setLocationy((int)(Math.random()*(meters-10)));
		anim.setStrength((int)(Math.random()*100));
		}
		int random1 =(int)(Math.random()*(animals.size()));
		/*for(Animal anim:animals)
		{
			System.out.println(anim.getName()+" "+anim.getStrength()+" "+anim.getLocationx()+" "+anim.getLocationy());
		}*/
		//int random2 =(int)(Math.random()*30);
		for(int l=0;l<animals.size();l++)
		{
		if(animals.get(random1).getLocationx()>0&&animals.get(l).getLocationx()>0&&animals.get(random1).getLocationy()>0&&animals.get(l).getLocationy()>0)
		{	
		if(Math.abs((animals.get(random1).getLocationx())-(animals.get(l).getLocationx()))<10&&Math.abs((animals.get(random1).getLocationy())-(animals.get(l).getLocationy()))<10)
		{	
		 if(animals.get(random1) instanceof Herbivore&&animals.get(l) instanceof Carnivore)
		 {
		// System.out.println(animals.get(random1).getName()+" Strength:"+animals.get(random1).getStrength()+" Location x:"+animals.get(random1).getLocationx()+" Location y:"+animals.get(random1).getLocationy());
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
				else if(((Carnivore)animals.get(l)).kill()>50)
				{
					System.out.println(animals.get(l).getName()+" kills "+animals.get(random1).getName());
					animals.remove(random1);
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
		 // System.out.println(animals.get(l).getName()+" Strength:"+animals.get(l).getStrength()+" Location x:"+animals.get(l).getLocationx()+" Location y:"+animals.get(l).getLocationy());
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
				else if(((Carnivore)animals.get(random1)).kill()>50)
				{
					System.out.println(animals.get(random1).getName()+" kills "+animals.get(l).getName());
					animals.remove(l);
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
		   // System.out.println(animals.get(l).getName()+" Strength:"+animals.get(l).getStrength()+" Location x:"+animals.get(l).getLocationx()+" Location y:"+animals.get(l).getLocationy());
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
	/*for(Animal test:animals)
	{
		System.out.println(test.getName());
	}*/
		}
		System.out.println(random1+"   "+l);
		}
		}

    }
		
}
	
