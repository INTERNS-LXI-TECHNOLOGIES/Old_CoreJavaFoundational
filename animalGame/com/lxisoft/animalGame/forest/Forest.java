package com.lxisoft.animalGame.forest;
import com.lxisoft.animalGame.forest.*;
import java.util.ArrayList;
public class Forest
{
    //Animal[]animals=new Animal[12];
   ArrayList<Animal> animal=new ArrayList();
	 public void detailsOfAnimal()
		{

		int x=1,y=1,z=1,o=1;
		for(int i=0;i<3;i++,x++)
				{
				  animal.add(new Tiger());
				  animal.get(i).setName("Tiger"+x+"");
				}
		for(int j=3;j<6;j++,y++)
				{
				  animal.add(new Lion());
				  animal.get(j).setName("Lion"+y+"");
				}
		for(int k=6;k<9;k++,z++)
				{
				  animal.add(new Rabbit());
				  animal.get(k).setName("Rabbit"+z+"");
				}
					
		for(int l=9;l<12;l++,o++)
				{
				  animal.add(new Deer());
				  animal.get(l).setName("Deer"+o+"");
				}
			
			System.out.println("ANIMALS IN FOREST");
			System.out.println("==================");
					for(int m=0;m<12;m++)
					{
						System.out.println(animal.get(m).getName());
				    }
					
					System.out.println("************");
					
	
		}
public void fight()

{		
int animal1,animal2;
for(int j=1,w=1;j<animal.size();w++)
{

	for(int i=0;i<animal.size();i++)
{
	
	animal1=(int)(Math.random()*animal.size());
    //animal2=(insetStrengtht)(Math.random()*animal.size());
	animal2=(int)(Math.random()*animal.size());				
	 animal.get(animal1).setStrength();
	 animal.get(animal2).setStrength();
	 animal.get(animal1).setLocationX();
	 animal.get(animal2).setLocationX();
	 animal.get(animal1).setLocationY();
	 animal.get(animal2).setLocationY();
	 
	 int  x1=animal.get(animal1).getLocationX();
	 int  x2=animal.get(animal2).getLocationX();
	 int  y1=animal.get(animal1).getLocationY();
	 int  y2=animal.get(animal2).getLocationY();

				
	if(animal.get(animal1)!=animal.get(animal2))
	{      
		 int differance1=x1-x2;
		 int differance2=y1-y2;
		 
		if(differance1<0&&differance2<0)
		 {
			  differance1=(-(differance1));
			  differance2=(-(differance2));
		}
		 else if(differance1<0&&differance2>0)
		 {
			 differance1=(-(differance1));
			
		 }
		 else if(differance1>0&&differance2<0)
		 {
			 differance2=(-(differance2));
			 
		 }
				
			  	
		   if(differance1<=10&&differance2<=10)
			{
							  
			if(animal.get(animal1).getStrength()>animal.get(animal2).getStrength())
				 {

					 
					System.out.println(""+animal.get(animal1).getName()+" kills "+animal.get(animal2).getName());
					System.out.println("location a1 x"  +animal.get(animal1).getLocationX()+"y"  +animal.get(animal1).getLocationY());
					System.out.println("location a2 x"  +animal.get(animal2).getLocationX()+"y"  +animal.get(animal2).getLocationY());
				
				if(animal.get(animal1) instanceof Herbivorous)
					{
					animal.get(animal1).eat();
					((Herbivorous)animal.get(animal1)).luck();
					}
					animal.remove(animal.get(animal2));

					System.out.println("...................................");
				
				 }  
				else
				 { 
					System.out.println(""+animal.get(animal2).getName()+" kills "+animal.get(animal1).getName());
					System.out.println("location a1 x"  +animal.get(animal1).getLocationX()+"y"  +animal.get(animal1).getLocationY());
					System.out.println("location a2 x"  +animal.get(animal2).getLocationX()+"y"  +animal.get(animal2).getLocationY());
				    animal.remove(animal.get(animal1));
					System.out.println("********...................................");
					 
				 }
		   }
						 	
     }
}
} 
for(Animal a:animal)
{
 System.out.println(a.getName());

 }               

}
}