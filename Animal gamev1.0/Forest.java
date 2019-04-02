import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Forest
{
	ArrayList<Animal> animals=new ArrayList<Animal>();

 public void setDetails()
 {
 	for(int i=0;i<5;i++) 
 	{
 		createAnimal(new Lion(),"Lion"+(i+1), 200);
	 	createAnimal(new Tiger(),"Tiger"+(i+1), 150);
	 	createAnimal(new Bear(),"Bear"+(i+1), 110);
	 	createAnimal(new Deer(),"Deer"+(i+1),100);
	 	createAnimal(new Rabbit(),"Rabbit"+(i+1), 70);
 	}
 }
 public void createAnimal(Animal created, String name,int strengthLevel)
 {
 		animals.add(created);
	 	created.setName(name);
	 	created.setStrengthLevel((int)(Math.random()*strengthLevel));
	 	created.setHungerLevel((int)(Math.random()*10));
 }
 public void fight()
 {	
 	Animal [][] grids =new Animal[8][8];
 	Scanner in=new Scanner(System.in);
 	String fight;
 	boolean a = false;
 	int count=1;
 	System.out.println("FIGHT BEGIN IN THE FOREST "+"\n**********************");
	
   do{
   	    System.out.println("\n\nROUND"+" "+count+"\n------------------");
   	    count++;
   	    
 	       	for(int i=0;i<animals.size();i++)
 	       	{
 	       		animals.get(i).setLocationX((int)(Math.random()*8));
 	       		animals.get(i).setLocationY((int)(Math.random()*8));
 	       		
 	       	}

 	        int j=(int)(Math.random()*animals.size());
 			int k=(int)(Math.random()*animals.size());
 			if(j!=k && animals.get(j)!=null && animals.get(k)!=null)
 			{
 				if (animals.get(j) instanceof Carnivore &&animals.get(k) instanceof Carnivore) 
 				{
 					
 					boolean status = animals.get(j).fight(animals.get(k));

	 					if(status == true)
	 					 {
	 					 	animals.remove(j);
	 					 }
	 					else
	 					 {
	 						animals.remove(k);

	 					 }
 				}
 				else if(animals.get(j) instanceof Carnivore & animals.get(k) instanceof Herbivore | animals.get(k) instanceof Carnivore & animals.get(j) instanceof Herbivore)
	 				 {
	 				 	boolean s= animals.get(j).eat(animals.get(k));
		 				 if(s==true)
		 				 {
		 				 	animals.remove(k);
		 				 }

	 				 else
	 				 {
	 				 	animals.remove(j);
	 				 }


 				}
 				else if (animals.get(k) instanceof Herbivore & animals.get(j) instanceof Herbivore | animals.get(j) instanceof Herbivore & animals.get(k) instanceof Herbivore)
 				{
 					animals.get(k).meet(animals.get(j));
 				}
 				
	 	    }
	 	   
 
 	
	 	    for(int i=0;i<8;i++)
 			{
 			for( j=0;j<8;j++)
 			{
 			grids[i][j]=null;
 			}
       	    }
       	    grids=setGrid(animals,grids); 
      	    
   	}
    while(animals.size()>1);
      
        	System.out.println("\n"+"*************************************");
		    System.out.println("*"+animals.get(0).getName()+" "+"Roaming Around In The Forest !*"+
				            "\n*************************************");
	}

	public Animal [][] setGrid(ArrayList <Animal> animals,Animal [][] grids)
     {
     	

	     		for(int i=0;i<8;i++)
	 		{

	 			for(int j=0;j<8;j++)
	 			{ 

	 				for(int k=0;k<animals.size();k++)
	 				{

	 				if(i==animals.get(k).getLocationX() && j==animals.get(k).getLocationY())
	 				{
	 				grids[i][j]=(animals.get(k));
	 					
	 				}
	 			   }

	 			}
	 			System.out.print(" ");

	 		}
	 		
	     		for(int i=0;i<8;i++)
	 		{
	         	for(int j=0;j<8;j++)
	 			{	
	 				if(grids[i][j]!=null)
	 				{
	 				System.out.print(grids[i][j].getName()+"("+i+","+j+")");
	 				}
	 				if(grids[i][j]==null)
	 				{
	 					System.out.print("   ");
	 				}
	 			}
	 			System.out.print(" ");
	 	
	 		}
	 		for(int i=0;i<animals.size();i++)System.out.print(animals.get(i).getName()+"XXXXXXXXXXXXXXXXXXXXXX ");

	 		return grids;
     }
     
	 }  



 	