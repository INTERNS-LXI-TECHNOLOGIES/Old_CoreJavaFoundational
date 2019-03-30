import java.util.*;

public class Forest
{
	 ArrayList<Animal> animals = new ArrayList<>();
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
		int x,y;		
		do
		{
		x=(int)(Math.random()*10);
		y=(int)(Math.random()*10);	
		}	
		while(array[x][y]!=null);
		animals.setLocationX(x);
		animals.setLocationY(y);
		array[animals.getLocationX()][animals.getLocationY()]=animals;
		
	}
 public void initiatingFight()
 {	
 	
 	
 	boolean x=false;
 	do{
 		int a=(int)(Math.random()*animals.size());
 		int b=(int)(Math.random()*animals.size());
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
 						animals.remove(b);
 					
 						System.out.println("++");
 					}
 					else
 					{
 						animals.remove(a);
 						
 						System.out.println("++");
 					}
 					print();
 					
 				}
 				else if(animals.get(a) instanceof Carnivores && animals.get(b) instanceof Herbivores)
 				{
 					boolean s=animals.get(a).eat(animals.get(b));
 					if(s==true)
 					{
 						animals.remove(b);
 					}
 					print();
 				}
 				else if(animals.get(b) instanceof Carnivores && animals.get(a) instanceof Herbivores)
 				{
 					boolean s=animals.get(b).eat(animals.get(a));
 					if(s==true)
 					{
 						animals.remove(a);
 					}
 					print();
 				}
 			}
 		}

 	}
 	
 	while(animals.size()>1);
 	System.out.println("\n**"+animals.get(0).getName() +" wins the fight**");

}
public void print()
{
	for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				array[i][j]=null;
			}
		}
		for(int i=0;i<animals.size();i++)
		{
			int x,y;
			do
		    {
		    x=(int)(Math.random()*10);
		    y=(int)(Math.random()*10);	
		    }	
		     while(array[x][y]!=null);
		     animals.setLocationX(x);
			animals.setLocationY(y);
		     array[animals.getLocationX()][animals.getLocationY()]=animals;	
           // array[x][y]=animals.get(i);
		    
		}
     for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.print("\n");
		}


}
}