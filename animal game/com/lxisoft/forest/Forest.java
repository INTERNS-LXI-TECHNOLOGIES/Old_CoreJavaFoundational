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
}
public void fight()
{
System.out.println("AVAILABLE ANIMALS WHO IS READY TO FIGHT AND THEIR STRENGTH LEVELS");
System.out.println("_________________________________________________________________");
int k,i,j;
for(j=1,k=1;j<animals.size();)
{
	
	System.out.println("Round "+k);
	System.out.println("------------");
	
for(i=0;i<animals.size();i++)
{
	int random1=(int)(Math.random()*animals.size());
	int random2=(int)(Math.random()*animals.size());
	int strength1=animals.get(random1).strength();
int strength2=animals.get(random2).strength();

int locationX1=animals.get(random1).locationX();
int locationY1=animals.get(random1).locationY();
int locationX2=animals.get(random2).locationX();
int locationY2=animals.get(random2).locationY();
int d1=Math.abs(locationX1-locationX2);
int d2=Math.abs(locationY1-locationY2);
	
		
	if(animals.get(random1).getName()!=animals.get(random2).getName())
	{
	if(d1<=10 && d2<=10)
      {
		  
	    System.out.println("Animal="+animals.get(random1).getName()+" Strength="+strength1+" location="+locationX1+","+locationY1);
	    System.out.println("Animal="+animals.get(random2).getName()+" Strength="+strength2+" location="+locationX2+","+locationY2);
		
		System.out.println(d1);
        System.out.println(d2);

	
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

}
k++;

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
