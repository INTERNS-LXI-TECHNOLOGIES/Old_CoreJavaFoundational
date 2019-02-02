package com.lxisoft.animalGame.forest;
import com.lxisoft.animalGame.forest.*;

public class Forest
{
    Animal[]animal=new Animal[12];
		 public void detailsOfAnimal()
			{
               int x=1;
			   for(int i=0;i<3;i++)
					{
						animal[i]=new Tiger();
						animal[i].setName("Tiger"+x+"");
						x++;
					}
					for(int j=3;j<6;j++)
					{
						animal[j]=new Lion();
						animal[j].setName("Lion"+x+"");
						x++;
					}
					for(int k=6;k<9;k++)
					{
						animal[k]=new Rabbit();
						animal[k].setName("Rabbit"+x+"");
						x++;
					}
					for(int l=9;l<12;l++)
					{
						animal[l]=new Deer();
						animal[l].setName("Deer"+x+"");
						x++;
					}
					
					System.out.println("ANIMALS IN FOREST");
					System.out.println("==================");
					for(int m=0;m<12;m++)
					{
						System.out.println(animal[m].getName());
						
					}
					int a,b;
					System.out.println("************");
					
					 a=(int)(Math.random()*12);
				     b=(int)(Math.random()*12);
					 System.out.println("a="+animal[a].getName()+" "+animal[a].aa());
				     System.out.println("b="+animal[b].getName()+" "+animal[b].aa());
					
				
				
			   
				
				if(animal[a].getStrength()>animal[b].getStrength())
				{
					System.out.println(animal[a].getName()+animal[a].getStrength());
					System.out.println("winner is"+animal[a].getName());
				}
				else
				{
					System.out.println(animal[b].getName()+animal[b].getStrength());
					System.out.println("winner is"+animal[b].getName());
				}
				
			}
}