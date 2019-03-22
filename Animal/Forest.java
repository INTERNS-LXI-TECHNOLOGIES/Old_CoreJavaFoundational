import java.util.*;

public class Forest
{
	Animal[] animal = new Animal[4];
	Animal tiger = new Tiger();
	Animal lion = new Lion();
	Animal rabbit = new Rabbit();
	Animal deer = new Deer();
	
	
public void fighters()
{	
	int i;
	int count=0;
	boolean x=false;
	animal[0] = tiger;
	tiger.name="Tiger";
	tiger.animalStrength=((int)(Math.random()*100));
	System.out.println("tiger strength : "+tiger.animalStrength);
	animal[1] = lion;
	lion.name="Lion";
	lion.animalStrength=((int)(Math.random()*100));
	System.out.println("lion strength : "+lion.animalStrength);
	animal[2] = rabbit;
	rabbit.name="Rabbit";
	rabbit.animalStrength=((int)(Math.random()*100));
	System.out.println("rabbit strength : "+rabbit.animalStrength);
	animal[3] = deer;
	deer.name="Deer";
	deer.animalStrength=((int) (Math.random()*100));
	System.out.println("deer strength : "+deer.animalStrength);
	do
	{
	int a=(int)(Math.random()*4);
	int b=(int)(Math.random()*4);
	if(animal[a]!=null && animal[b]!=null)
	{
	if(a!=b)
	{
	x=animal[a].fight(animal[b]);
		if(x==true)
		{
			animal[b]=null;
		}
		else
		{
			animal[a]=null;
		}
	}
	}
	count=0;
	for(i=0;i<4;i++)
	{
		if(animal[i]==null)
		{
			count++;
		}

	}	
	}
	while(count<3);
	for(i=0;i<4;i++)
	{
		if(animal[i]!=null)
		{
			System.out.println("FIGHT STOPS ........");
		}
	}
}
}