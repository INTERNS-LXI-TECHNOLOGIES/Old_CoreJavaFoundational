import java.util.*;

public class Forest
{
	ArrayList<Animal> animals = new ArrayList<>();
   	
	

	public Forest(){
	
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				area();
				grids[i][j]=null;
			}
		}
		setDetails();
	}

	public void create(Animal animals,String name,int animalStrength)
	{
		animals.setName(name);
		animals.setAnimalStrength(animalStrength);
		position(animals);
		this.animals.add(animals);
		
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
	public void position(Animal animals)
	{
		area();
		int x,y;		
		do
		{
		x=(int)(Math.random()*10);
		y=(int)(Math.random()*10);	
		}	
		while(grids[x][y]!=null);
		animals.setLocationX(x);
		animals.setLocationY(y);
		grids[animals.getLocationX()][animals.getLocationY()]=animals;
		
	}
 public void initiatingFight()
 {	
 	area();
 	boolean x=false;
 	do
 	{
 		int a=(int)(Math.random()*animals.size());
 		int b=(int)(Math.random()*animals.size());
 		
			for(int j=0;j<animals.size();j++)
			{
				position(animals.get(j));
			}
 	//	System.out.println(">>>>>>>>>>>>>>>>>"+Math.random()*animal.size());
 		if(animals.get(a)!=null && animals.get(b)!=null)
 		{
 			if(a!=b)
 			{
 				if(animals.get(b) instanceof Herbivores && animals.get(a) instanceof Herbivores)
				{
 					boolean m=animals.get(a).meet(animals.get(b));				
 				}
 				else if(animals.get(a) instanceof Carnivores && animals.get(b) instanceof Carnivores)
				{
					x=animals.get(a).fight(animals.get(b));
					System.out.println(x);
					if(x==true)
 					{
 						animals.remove(grids[animals.get(b).getLocationX()][animals.get(b).getLocationY()]);
 					}
 					else
 					{
 						animals.remove(grids[animals.get(a).getLocationX()][animals.get(a).getLocationY()]);
 					}	
 				}
 				else if(animals.get(a) instanceof Carnivores && animals.get(b) instanceof Herbivores)
 				{
 					boolean s=animals.get(a).eat(animals.get(b));
 					if(s==true)
 					{
 						animals.remove(grids[animals.get(b).getLocationX()][animals.get(b).getLocationY()]);
 					}
 					
 				}
 				else if(animals.get(b) instanceof Carnivores && animals.get(a) instanceof Herbivores)
 				{
 					boolean s=animals.get(b).eat(animals.get(a));
 					if(s==true)
 					{
 						animals.remove(grids[animals.get(a).getLocationX()][animals.get(a).getLocationY()]);
 					}
 					
 				}
 			}
 		}

 		print();
 		System.out.println("___________________________________________________________________________");
 		
 		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				grids[i][j]=null;
			}
		}	
 	}
 	
 	
 	while(animals.size()>1);
 	System.out.println("\n**"+animals.get(0).getName() +" wins the fight**");

}
public void print()
{
	area();
	for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(grids[i][j]!=null)
				{
					System.out.print(grids[i][j].getName()+"\t\t");
				}
				else
				{
					System.out.print("0\t\t");
				}
			}
			System.out.println();
		}
}
public void area(Animal grids[][])
{
	Animal[][] grids=new Animal[20][20];
}
}