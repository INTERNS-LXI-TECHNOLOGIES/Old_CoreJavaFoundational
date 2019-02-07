package com.lxisoft.forest;
import com.lxisoft.animal.*;
import java.util.ArrayList;
public class Forest
{

ArrayList<Animal> animals=new ArrayList<Animal>();

public void setAnimalDetails()
{
for(int i=0;i<3;i++)
{
	animals.add(new Tiger());
	animals.get(i).setName("Tiger"+(i+1));
}

for(int i=3;i<6;i++)
{
	animals.add(new Lion());
	animals.get(i).setName("Lion"+(i-2));
}

for(int i=6;i<9;i++)
{
	animals.add(new Rabbit());
	animals.get(i).setName("Rabbit"+(i-5));
}

for(int i=9;i<12;i++)
{
	animals.add(new Deer());
	animals.get(i).setName("Deer"+(i-8));
}
System.out.println("AVAILABLE ANIMALS");
System.out.println("_________________");

for(int i=0;i<3;i++)
{
	System.out.println(animals.get(i).getName());
}

for(int i=3;i<6;i++)
{
	System.out.println(animals.get(i).getName());
}

for(int i=6;i<9;i++)
{
System.out.println(animals.get(i).getName());
}	

for(int i=9;i<12;i++)
{
System.out.println(animals.get(i).getName());
}

System.out.println("   ");
System.out.println("AVAILABLE ANIMALS WHO IS READY TO FIGHT AND THEIR STRENGTH LEVELS");
System.out.println("_________________________________________________________________");

for(int i=0;i<12;i++)
{
	int random1=(int)(Math.random()*animals.size());
	int random2=(int)(Math.random()*animals.size());
	int strength1=animals.get(random1).strength();
int strength2=animals.get(random2).strength();
	
		System.out.println("Animal="+animals.get(random1).getName()+" Strength="+strength1);
	System.out.println("Animal="+animals.get(random2).getName()+" Strength="+strength2);
		
	
	if(animals.get(random1).getName()!=animals.get(random2).getName())
	{
	
		if(strength1>strength2)
		{
			System.out.println(animals.get(random1).getName()+" win...");
			System.out.println("  ");
			animals.remove(random2);
		}
		else 
		{
		System.out.println(animals.get(random2).getName()+" win...");
		System.out.println("  ");
		animals.remove(random1);
		
	}
	
}
}
System.out.println("  ");
System.out.println("ALIVE ANIMALS");
System.out.println("_____________");
for(Animal a:animals)
{
	
	System.out.println(a.getName());
	
}


}
}	
