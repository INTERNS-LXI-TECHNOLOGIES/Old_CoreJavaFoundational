import java.util.*;

public class Forest
{
	 ArrayList<Animal> animal = new ArrayList<>();
	Animal[][] array=new Animal[20][20];

	public Forest(){
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				array[i][j]=null;
			}
		}
		setDetails();
	}

	public void create(Animal animal,String name,int animalStrength)
	{
		animal.setName(name);
		animal.setAnimalStrength(animalStrength);
		position(animal);
		this.animal.add(animal);
		
	}
	public void setDetails()
	{
		for(int i=0;i<5;i++)
		{
			create(new Lion(),"Lion"+(i+1),(int)(Math.random()*200));
			create(new Tiger(),"Tiger"+(i+1),(int)(Math.random()*100));
			create(new Rabbit(),"Rabbit"+(i+1),(int)(Math.random()*80));
			create(new Deer(),"Deer"+(i+1),(int)(Math.random()*80));
		}
	}
	public void position(Animal animal)
	{
		int x,y;		
		do
		{
		x=(int)(Math.random()*10);
		y=(int)(Math.random()*10);	
		}	
		while(array[x][y]!=null);
		animal.setLocationX(x);
		animal.setLocationY(y);
		array[animal.getLocationX()][animal.getLocationY()]=animal;
		
	}
 public void initiatingFight()
 {	
 	
 	
 	boolean x=false;
     do
     {
 		int a=(int)(Math.random()*animal.size());
 		int b=(int)(Math.random()*animal.size());
 	//	System.out.println(">>>>>>>>>>>>>>>>>"+Math.random()*animal.size());
 		if(animal.get(a)!=null && animal.get(b)!=null)
 		{
 			if(a!=b)
 			{
 				if(animal.get(b) instanceof Herbivores && animal.get(a) instanceof Herbivores)
				{
 					boolean m=animal.get(a).meet(animal.get(b));				
 				}
 				else if(animal.get(a) instanceof Carnivores && animal.get(b) instanceof Carnivores)
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
public void print()
{
	for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(array[i][j]!=null)
				{
					System.out.print(array[i][j].getName()+"\t\t");
				}
				else{
					System.out.print("0\t\t");
				}
			}
			System.out.println();
		}
}
}