import java.util.*;

public class Forest
{
	

public void fighters()
{	
	int i;
	int count=0;
	boolean x=false;
	Animal winner=null;
	ArrayList<Animal> animal = new ArrayList<>();
		animal.add(new Lion());
		animal.get(0).setName("Lion");
		animal.get(0).setAnimalStrength((int)(Math.random()*100));

		animal.add(new Tiger());
		animal.get(1).setName("Tiger");
		animal.get(1).setAnimalStrength((int)(Math.random()*100));

		animal.add(new Deer());
		animal.get(2).setName("Deer");
		animal.get(2).setAnimalStrength((int)(Math.random()*100));

		animal.add(new Rabbit());
		animal.get(3).setName("Rabbit");
		animal.get(3).setAnimalStrength((int)(Math.random()*100));
	do
	{
	int a=(int)(Math.random()*animal.size());
	int b=(int)(Math.random()*animal.size());
	if(animal.get(a)!=null && animal.get(b)!=null)
	{
	if(a!=b)
	{
	x=animal.get(a).fight(animal.get(b));
		if(x==true)
		{
			animal.remove(b);
		}
		else
		{
			animal.remove(a);
		}
	}
	}	
	}
	while(animal.size()>1);
	System.out.println("\n**"+animal.get(0).getName());
		
}
}