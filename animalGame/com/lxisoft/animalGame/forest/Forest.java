package com.lxisoft.animalGame.forest;
import com.lxisoft.animalGame.forest.*;
public class Forest
{
    Animal[]animal=new Animal[12];
	 public void detailsOfAnimal()
		{
             int x=1,y=1,z=1,o=1;
			 for(int i=0;i<3;i++,x++)
				{
				  animal[i]=new Tiger();
				  animal[i].setName("Tiger"+x+"");
				}
			 for(int j=3;j<6;j++,y++)
				{
				  animal[j]=new Lion();
				  animal[j].setName("Lion"+y+"");
				}
			for(int k=6;k<9;k++,z++)
				{
				  animal[k]=new Rabbit();
				  animal[k].setName("Rabbit"+z+"");
				}
					
			for(int l=9;l<12;l++,o++)
				{
				  animal[l]=new Deer();
				  animal[l].setName("Deer"+o+"");
				}
			
			System.out.println("ANIMALS IN FOREST");
			System.out.println("==================");
					for(int m=0;m<12;m++)
					{
						System.out.println(animal[m].getName());
				    }
					int animal1,animal2;
					System.out.println("************");
					
				    animal1=(int)(Math.random()*12);
				    animal2=(int)(Math.random()*12);
				
				
				 
				 System.out.println("animal 1=   "+animal[animal1].getName()+"   STRENGTH="+animal[animal1].returnStrength()+"     x1="+animal[animal1].location1()+"    y1="+animal[animal1].location2());
				 System.out.println("animal 2=   "+animal[animal2].getName()+"   STRENGTH="+animal[animal2].returnStrength()+"     x2="+animal[animal2].location1()+"    y2="+animal[animal2].location2());
                 int  x1=animal[animal1].getLocationX();
			     int  x2=animal[animal2].getLocationX();
	             int  y1=animal[animal1].getLocationY();
			     int  y2=animal[animal2].getLocationY();
				 
				
				if(animal[animal1]!=animal[animal2])
		  { 
				 int differance1=x1-x2;
				 int differance2=y1-y2;
				 System.out.println("   d1= "+differance1+"   d2=  "+differance2);
				 if(differance1<0&&differance2<0)
				 {
					  differance1=(-(differance1));
					  System.out.println("d1="+differance1);
					  differance2=(-(differance2));
					  System.out.println("d2="+differance2);
				 }
				 else if(differance1<0&&differance2>0)
				 {
					 differance1=(-(differance1));
					 System.out.println("d1="+differance1);
					 
				 }
				 else if(differance1>0&&differance2<0)
				 {
					 differance2=(-(differance2));
					 System.out.println("d2="+differance2);
				 }
					
		 
				  if(differance1<=10&&differance2<=10)
				  {  
					 if(animal[animal1].getStrength()>animal[animal2].getStrength())
				     {
						System.out.println("winner is"+animal[animal1].getName());
				        
					 }  
				    else
				     { 
						System.out.println("winner is"+animal[animal2].getName());
				     }
			      }
				 
				    else 
				    {
					  System.out.println("will not fight");
				    }
		  }
				 else
				 {
					 System.out.println(".........");
				 }
		}

	
	
	
	
	
	
	
	
	}