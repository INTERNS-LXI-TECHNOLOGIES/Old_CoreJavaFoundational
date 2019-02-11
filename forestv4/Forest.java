package com.lxisoft.forestv4;
import com.lxisoft.forestv4.animal.Animal;
import com.lxisoft.forestv4.animal.*;
import java.util.ArrayList;
public class Forest
{
	private ArrayList <Animal> animals;
	private ArrayList <Flume> flumes;
	public void setAnimals(ArrayList <Animal> animals)
	{
		this.animals=animals;
	}
	public ArrayList <Animal> getAnimals()
	{
		return animals;
	} 
	public void setFlumes(ArrayList <Flume> flumes)
	{
		this.flumes=flumes;
	}
	public ArrayList <Flume> getFlumes()
	{
		return flumes;
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
	getAnimals().get(j).setSpeed(6);
	getAnimals().get(j+1).setSpeed(7);
	getAnimals().get(j+2).setSpeed(4);
	getAnimals().get(j+3).setSpeed(5);
	getAnimals().get(j+4).setSpeed(3);
	getAnimals().get(j+5).setSpeed(2);
	j=j+6;
	}
	getAnimals().add(new Hunter());
	getAnimals().get(30).setName("Hunter");
	getAnimals().get(30).setSpeed(1);
	 setFlumes(new ArrayList <Flume>());
	for(int k=0;k<3;k++)
	{
		getFlumes().add(new Flume());
		getFlumes().get(k).setLocationx((int)(Math.random()*60));
		getFlumes().get(k).setLocationy((int)(Math.random()*60));
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
		for(int f=0;f<3;f++)
		{
		for(int l=0;l<animals.size();l++)
		{
			int random1 =(int)(Math.random()*animals.size()-1);
		if(animals.get(random1).getLocationx()>0&&animals.get(l).getLocationx()>0&&animals.get(random1).getLocationy()>0&&animals.get(l).getLocationy()>0)
		{	
		
		if((flumes.get(f).getLocationx()==animals.get(random1).getLocationx())&&(flumes.get(f).getLocationy()==animals.get(random1).getLocationy()))
		{
			animals.remove(random1);
			System.out.println("Fall");
		}
		else
		{
		if((flumes.get(f).getLocationx()==animals.get(l).getLocationx())&&(flumes.get(f).getLocationy()==animals.get(l).getLocationy()))
		{
			animals.remove(l);
			System.out.println("Fall");
		}
		else
		{
		if(Math.abs((animals.get(random1).getLocationx())-(animals.get(l).getLocationx()))<10&&Math.abs((animals.get(random1).getLocationy())-(animals.get(l).getLocationy()))<10)
		{	
		 if(animals.get(random1) instanceof Herbivore&&animals.get(l) instanceof Carnivore)
		 {
			 System.out.println(animals.get(random1).getName()+" x:"+animals.get(random1).getLocationx()+" y:"+animals.get(random1).getLocationy());
		    System.out.println(animals.get(l).getName()+" x:"+animals.get(l).getLocationx()+" y:"+animals.get(l).getLocationy()); 
			int luckFactor=((Herbivore)animals.get(random1)).checkLuck();
			if(luckFactor>=75)
			{
				//System.out.println("Luck factor:"+luckFactor);
			System.out.println(animals.get(random1).getName()+" escaped from the location");
			animals.get(random1).setLocationx(animals.get(random1).getLocationx()+animals.get(random1).getSpeed());
			animals.get(random1).setLocationy(animals.get(random1).getLocationy()+animals.get(random1).getSpeed());
			System.out.print(animals.get(random1).getName()+" Changed locationx "+animals.get(random1).getLocationx());
			System.out.println(" Changed locationy "+animals.get(random1).getLocationy());
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
			//continue;
		 }
		 else if(animals.get(random1) instanceof Carnivore&&animals.get(l) instanceof Herbivore)
		 {
				System.out.println(animals.get(random1).getName()+" x:"+animals.get(random1).getLocationx()+" y:"+animals.get(random1).getLocationy());
		    System.out.println(animals.get(l).getName()+" x:"+animals.get(l).getLocationx()+" y:"+animals.get(l).getLocationy()); 
			int luckFactor=((Herbivore)animals.get(l)).checkLuck();
			if(luckFactor>=75)
			{
				//System.out.println("Luck factor:"+luckFactor);
			System.out.println(animals.get(l).getName()+" escaped from the location");
			animals.get(l).setLocationx(animals.get(l).getLocationx()+animals.get(l).getSpeed());
			animals.get(l).setLocationy(animals.get(l).getLocationy()+animals.get(l).getSpeed());
			System.out.print(animals.get(l).getName()+" Changed locationx "+animals.get(l).getLocationx());
			System.out.println(" Changed locationy "+animals.get(l).getLocationy());
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
				System.out.println(animals.get(random1).getName()+" x:"+animals.get(random1).getLocationx()+" y:"+animals.get(random1).getLocationy());
		    System.out.println(animals.get(l).getName()+" x:"+animals.get(l).getLocationx()+" y:"+animals.get(l).getLocationy()); 
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
				System.out.println(animals.get(random1).getName()+" x:"+animals.get(random1).getLocationx()+" y:"+animals.get(random1).getLocationy());
		    System.out.println(animals.get(l).getName()+" x:"+animals.get(l).getLocationx()+" y:"+animals.get(l).getLocationy()); 
			System.out.println("not fighting");
			}
		}
		else if((animals.get(random1) instanceof Omnivore&&animals.get(l) instanceof Carnivore))
		 {
			 System.out.println(animals.get(random1).getName()+" x:"+animals.get(random1).getLocationx()+" y:"+animals.get(random1).getLocationy());
		    System.out.println(animals.get(l).getName()+" x:"+animals.get(l).getLocationx()+" y:"+animals.get(l).getLocationy()); 
			int bullets=((Omnivore)animals.get(random1)).gun();
			if(bullets>0)
			{
				System.out.println(animals.get(random1).getName()+" hunts "+animals.get(l).getName());
					animals.remove(l);
			}
			else
			{
				System.out.println(animals.get(l).getName()+" kills "+animals.get(random1).getName());
	
					animals.remove(random1);
			}
		}
		else if(animals.get(random1) instanceof Carnivore&&animals.get(l) instanceof Omnivore)
		{
			System.out.println(animals.get(random1).getName()+" x:"+animals.get(random1).getLocationx()+" y:"+animals.get(random1).getLocationy());
		    System.out.println(animals.get(l).getName()+" x:"+animals.get(l).getLocationx()+" y:"+animals.get(l).getLocationy()); 
			int bullets=((Omnivore)animals.get(l)).gun();
			if(bullets>0)
			{
				System.out.println(animals.get(l).getName()+" hunts "+animals.get(random1).getName());
					animals.remove(random1);
			}
			else
			{
				System.out.println(animals.get(random1).getName()+" kills "+animals.get(l).getName());
	
					animals.remove(l);
			}
		}
		else if((animals.get(random1) instanceof Herbivore&&animals.get(l) instanceof Omnivore))
		 {
			System.out.println(animals.get(random1).getName()+" x:"+animals.get(random1).getLocationx()+" y:"+animals.get(random1).getLocationy());
		    System.out.println(animals.get(l).getName()+" x:"+animals.get(l).getLocationx()+" y:"+animals.get(l).getLocationy());  
			int bullets=((Omnivore)animals.get(l)).gun();
			if(bullets>0)
			{
				System.out.println(animals.get(l).getName()+" hunts "+animals.get(random1).getName());
					animals.remove(random1);
			}
			else
			{
				System.out.println(animals.get(random1).getName()+" escaped from that location");
				animals.get(random1).setLocationx(animals.get(random1).getLocationx()+animals.get(random1).getSpeed());
				animals.get(random1).setLocationy(animals.get(random1).getLocationy()+animals.get(random1).getSpeed());
				System.out.print(animals.get(random1).getName()+" Changed locationx "+animals.get(random1).getLocationx());
				System.out.println(" Changed locationy "+animals.get(random1).getLocationy());
			}
				
		 }
		else if(animals.get(random1) instanceof Omnivore&&animals.get(l) instanceof Herbivore)
		{
			System.out.println(animals.get(random1).getName()+" x:"+animals.get(random1).getLocationx()+" y:"+animals.get(random1).getLocationy());
		    System.out.println(animals.get(l).getName()+" x:"+animals.get(l).getLocationx()+" y:"+animals.get(l).getLocationy()); 
			int bullets=((Omnivore)animals.get(random1)).gun();
			if(bullets>0)
			{
				System.out.println(animals.get(random1).getName()+" hunts "+animals.get(l).getName());
					animals.remove(l);
			}
			else
			{
				System.out.println(animals.get(l).getName()+" escaped from that location");
				animals.get(l).setLocationx(animals.get(l).getLocationx()+animals.get(l).getSpeed());
				animals.get(l).setLocationy(animals.get(l).getLocationy()+animals.get(l).getSpeed());
				System.out.print(animals.get(l).getName()+" Changed locationx "+animals.get(l).getLocationx());
				System.out.println(" Changed locationy "+animals.get(l).getLocationy());
			}	
		}
		}
		}
		}
		}
		}
		}
		}while(animals.size()>1);

    }
		
}
	
