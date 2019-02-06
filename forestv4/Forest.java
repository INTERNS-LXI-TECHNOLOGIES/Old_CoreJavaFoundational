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
	
		for(int i=0;i<animals.size();i++)
		{
			System.out.println("   ***Fight on forest round"+r+"***");	
			r++;
		int random1 =(int)(Math.random()*animals.size()-1);
		for(Animal anim:animals)
		{
		anim.setLocationx((int)(Math.random()*50));
		anim.setLocationy((int)(Math.random()*50));
		anim.setStrength((int)(Math.random()*100));
		}
		/*for(Animal anim:animals)
		{
			System.out.println(anim.getName()+" "+anim.getStrength()+" "+anim.getLocationx()+" "+anim.getLocationy());
		}*/
		//int random2 =(int)(Math.random()*30);
		for(int l=0;l<animals.size();l++)
		{
		if((getAnimals().get(random1) instanceof Carnivore&&getAnimals().get(l) instanceof Carnivore)||(getAnimals().get(random1) instanceof Carnivore&&getAnimals().get(l) instanceof Herbivore)||(getAnimals().get(random1) instanceof Herbivore&&getAnimals().get(l) instanceof Carnivore))
		{
		if(Math.abs((getAnimals().get(random1).getLocationx())-(getAnimals().get(l).getLocationx()))<10&&Math.abs((getAnimals().get(random1).getLocationy())-(getAnimals().get(l).getLocationy()))<10)
		{
			
		if(getAnimals().get(random1).getStrength()>getAnimals().get(l).getStrength())
		{
			
			System.out.println(getAnimals().get(random1).getName()+" Strength:"+getAnimals().get(random1).getStrength()+" Location x:"+getAnimals().get(random1).getLocationx()+" Location y:"+getAnimals().get(random1).getLocationy());
		 System.out.println(getAnimals().get(l).getName()+" Strength:"+getAnimals().get(l).getStrength()+" Location x:"+getAnimals().get(random1).getLocationx()+" Location y:"+getAnimals().get(l).getLocationy());
		 System.out.println("*****Fighting*****");
		 if(getAnimals().get(random1) instanceof Herbivore)
		 {
			int luckFactor=((Herbivore)getAnimals().get(random1)).checkLuck();
			if(luckFactor>=75)
			{
				//System.out.println("Luck factor:"+luckFactor);
			System.out.println(getAnimals().get(random1).getName()+" escaped from the location");
			}
			else
			{
				if(getAnimals().get(l).eat()<50)
				{
					System.out.println(getAnimals().get(l).getName()+" eats "+getAnimals().get(random1).getName());
					animals.remove(random1);
				
				//System.out.println(getAnimals().get(l).getName()+" wins");
				}
				else if(((Carnivore)getAnimals().get(l)).kill()>50)
				{
					System.out.println(getAnimals().get(l).getName()+" kills "+getAnimals().get(random1).getName());
					animals.remove(random1);
				}
			}
			
		 }
		 else if(getAnimals().get(l) instanceof Herbivore)
		 {
			
			int luckFactor=((Herbivore)getAnimals().get(l)).checkLuck();
			if(luckFactor>=75)
			{
				//System.out.println("Luck factor:"+luckFactor);
			System.out.println(getAnimals().get(l).getName()+" escaped from the location");
			}
			else
			{
				if(getAnimals().get(random1).eat()<50)
				{
					System.out.println(getAnimals().get(random1).getName()+" eats "+getAnimals().get(l).getName());
					animals.remove(getAnimals().get(l).getName());
				//System.out.println(getAnimals().get(random1).getName()+" wins");
				}
				else if(((Carnivore)getAnimals().get(random1)).kill()>50)
				{
					System.out.println(getAnimals().get(random1).getName()+" kills "+getAnimals().get(l).getName());
					animals.remove(l);
				}
			}
			
		 }
		   else if(getAnimals().get(random1) instanceof Carnivore&&getAnimals().get(l) instanceof Carnivore)
		  {
				System.out.println(getAnimals().get(random1).getName()+" kills "+getAnimals().get(l).getName());
				animals.remove(l);
		  }
		 }
		}
		else if(getAnimals().get(random1).getStrength()<getAnimals().get(l).getStrength())
		{
			
			System.out.println(getAnimals().get(random1).getName()+" Strength:"+getAnimals().get(random1).getStrength()+" Location x:"+getAnimals().get(random1).getLocationx()+" Location y:"+getAnimals().get(random1).getLocationy());
		  System.out.println(getAnimals().get(l).getName()+" Strength:"+getAnimals().get(l).getStrength()+" Location x:"+getAnimals().get(l).getLocationx()+" Location y:"+getAnimals().get(l).getLocationy());
		  System.out.println("*****Fighting*****");
		if(getAnimals().get(random1) instanceof Herbivore)
		 {
			int luckFactor=((Herbivore)getAnimals().get(random1)).checkLuck();
			if(luckFactor>=75)
			{
				//System.out.println("Luck factor:"+luckFactor);
			System.out.println(getAnimals().get(random1).getName()+" escaped from the location");
			}
			else
			{
				if(getAnimals().get(l).eat()<50)
				{
					System.out.println(getAnimals().get(l).getName()+" eats "+getAnimals().get(random1).getName());
					animals.remove(random1);
				//System.out.println(getAnimals().get(l).getName()+" wins");
				}
				else if(((Carnivore)getAnimals().get(l)).kill()>50)
				{
					System.out.println(getAnimals().get(l).getName()+" kills "+getAnimals().get(random1).getName());
					animals.remove(random1);
				}
					
			}
			
		 }
		 else if(getAnimals().get(l) instanceof Herbivore)
		 {
			
			int luckFactor=((Herbivore)getAnimals().get(l)).checkLuck();
			if(luckFactor>=75)
			{
				//System.out.println("Luck factor:"+luckFactor);
			System.out.println(getAnimals().get(l).getName()+" escaped from the location");
			}
			else
			{
				if(getAnimals().get(random1).eat()<50)
				{
					System.out.println(getAnimals().get(random1).getName()+" eats "+getAnimals().get(l).getName());
					animals.remove(l);
				//System.out.println(getAnimals().get(random1).getName()+" wins");
				}
				else if(((Carnivore)getAnimals().get(random1)).kill()>50)
				{
					System.out.println(getAnimals().get(random1).getName()+" kills "+getAnimals().get(l).getName());
					animals.remove(l);
				}
			}
		 }
		  else if(getAnimals().get(l) instanceof Carnivore&&getAnimals().get(random1) instanceof Carnivore)
		  {
			  System.out.println(getAnimals().get(l).getName()+" kills "+getAnimals().get(random1).getName());
				animals.remove(random1);  
		  }
		}
		}
		else if(getAnimals().get(random1) instanceof Herbivore&&getAnimals().get(l) instanceof Herbivore)
		{
			System.out.println("not fighting");
		}
	/*for(Animal test:animals)
	{
		System.out.println(test.getName());
	}*/
		}
		}
}
		
}
	
