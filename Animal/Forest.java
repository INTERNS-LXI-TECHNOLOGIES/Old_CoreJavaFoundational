import java.util.*;

public class Forest
{
	

public void fighters()
{	
	int i,j,k;
	int count=0;
	boolean x=false;
	Animal winner=null;
	ArrayList<Animal> animal = new ArrayList<>();
	

		animal.add(new Lion());
		animal.get(0).setName("Lion");
		animal.get(0).setAnimalStrength((int)(Math.random()*100));
		animal.get(0).setLocationX((int)(Math.random()*30));
		animal.get(0).setLocationY((int)(Math.random()*30));

		animal.add(new Tiger());
		animal.get(1).setName("Tiger");
		animal.get(1).setAnimalStrength((int)(Math.random()*200));
		animal.get(1).setLocationX((int)(Math.random()*30));
		animal.get(1).setLocationY((int)(Math.random()*30));

		animal.add(new Deer());
		animal.get(2).setName("Deer");
		animal.get(2).setAnimalStrength((int)(Math.random()*80));
		animal.get(2).setLocationX((int)(Math.random()*30));
		animal.get(2).setLocationY((int)(Math.random()*30));

		animal.add(new Rabbit());
		animal.get(3).setName("Rabbit");
		animal.get(3).setAnimalStrength((int)(Math.random()*50));
		animal.get(3).setLocationX((int)(Math.random()*30));
		animal.get(3).setLocationY((int)(Math.random()*30));
	System.out.println("FIGHT BEGINS..........");

	do
	{
		int a=(int)(Math.random()*animal.size());
		int b=(int)(Math.random()*animal.size());
		String[][] array=new String[30][30];
		for(i=0;i<30;i++)
		{
			for(j=0;j<30;j++)
			{
				for(k=0;k<animal.size();k++)
				{
					if(animal.get(k).getLocationX()==i && animal.get(k).getLocationY()==j)
					{
						array[i][j]=animal.get(k).getName();	
						
						
					}	
				}
			}
		}
					for(i=0;i<30;i++)
						{

							for(j=0;j<30;j++)
							{
								System.out.print("	");
								if(array[i][j]!=null)
								{
								System.out.print(array[i][j]+" "+i+" "+j+" ");	
								}
							}
						 	System.out.println("\n");
						}
	
	if(animal.get(a)!=null && animal.get(b)!=null)
	{
	if(a!=b)
	{
		if(animal.get(a) instanceof Carnivores && animal.get(b) instanceof Carnivores)
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
		else if(animal.get(a) instanceof Carnivores && animal.get(b) instanceof Herbivores)
		{
			boolean s=animal.get(a).eat(animal.get(b));
			if(s==true)
			{
				animal.remove(b);
			}
		}
		else if(animal.get(b) instanceof Carnivores && animal.get(a) instanceof Herbivores)
		{
			boolean s=animal.get(b).eat(animal.get(a));
			if(s==true)
			{
				animal.remove(a);
			}
		}
	}
	}
	}	
	
	while(animal.size()>1);
	System.out.println("\n**"+animal.get(0).getName() +" wins the fight**");
		
}
}