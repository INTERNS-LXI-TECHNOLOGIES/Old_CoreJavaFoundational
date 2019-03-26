import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Forest
{
	ArrayList<Animal> animal=new ArrayList<Animal>();

 public void setDetails()
 {
 	animal.add(new Lion());
 	animal.get(0).setName("Lion");
 	animal.get(0).setStrengthLevel((int)(Math.random()*200));
 	animal.get(0).setHungerLevel((int)(Math.random()*10));

 	animal.add(new Tiger());
 	animal.get(1).setName("Tiger");
 	animal.get(1).setStrengthLevel((int)(Math.random()*150));
 	animal.get(1).setHungerLevel((int)(Math.random()*10));

 	animal.add(new Bear());
 	animal.get(2).setName("Bear");
 	animal.get(2).setStrengthLevel((int)(Math.random()*100));
 	animal.get(2).setHungerLevel((int)(Math.random()*10));

 	animal.add(new Deer());
 	animal.get(3).setName("Deer");
 	animal.get(3).setStrengthLevel((int)(Math.random()*80));
 	animal.get(3).setHungerLevel((int)(Math.random()*10));

 	animal.add(new Rabbit());
 	animal.get(4).setName("Rabbit");
 	animal.get(4).setStrengthLevel((int)(Math.random()*50));
 	animal.get(4).setHungerLevel((int)(Math.random()*10));

 }
 public void fight()
 {	
 	Scanner in=new Scanner(System.in);
 	String fight;
 	boolean a = false;
 	Animal winner=null;
 	int count = 0;
 	System.out.println("FIGHT BEGIN IN THE FOREST "+"\n **********************");

 	do{
 	        int j=(int)(Math.random()*animal.size());
 			int k=(int)(Math.random()*animal.size());
 			if(j!=k && animal.get(j)!=null && animal.get(k)!=null)
 			{
 				if (animal.get(j) instanceof Carnivore &&animal.get(k) instanceof Carnivore) 
 				{
 					
 					boolean status = animal.get(j).fight(animal.get(k));

 					if(status == true)
 					 {
 					 	animal.remove(k);
 					 }
 					else
 					 {
 						animal.remove(j);

 					 }
 				}
 				else if(animal.get(j) instanceof Carnivore && animal.get(k) instanceof Herbivore )
 				 {
 				 	boolean s= animal.get(j).eat(animal.get(k));
 				 if(s==true)
 				 {
 				 	animal.remove(k);
 				}

 				}
 				else if(animal.get(k) instanceof Carnivore && animal.get(j) instanceof Herbivore )
 				 {

 					boolean s= animal.get(k).eat(animal.get(j));
 				 if(s==true)
 				 {
 				 	animal.remove(j);
 				 }
 				}

	 			
	 	    }
 
        }
        while(animal.size()>1);
        
        	System.out.println("*************************************");
		    System.out.println("*"+animal.get(0).getName()+" "+"Roaming Around In The Forest !*"+
				            "\n*************************************");

     }
   

}




 	