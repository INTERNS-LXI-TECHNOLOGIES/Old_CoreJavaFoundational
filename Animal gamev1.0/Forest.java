import java.util.Random;
import java.util.Scanner;
public class Forest
{
	Animal[] animal=new Animal[5];

 public void setDetails()
 {
 
 	animal[0]=new Lion();
 	animal[1]=new Tiger();
 	animal[2]=new Bear();
 	animal[3]=new Deer(); 
 	animal[4]=new Rabbit();

 	animal[0].setName("Lion");
 	animal[1].setName("Tiger");
 	animal[2].setName("Bear");
 	animal[3].setName("Deer");
 	animal[4].setName("Rabbit");

	 	animal[0].setStrengthLevel((int)(Math.random()*100));
	 	animal[1].setStrengthLevel((int)(Math.random()*100));
	 	animal[2].setStrengthLevel((int)(Math.random()*100));
	 	animal[3].setStrengthLevel((int)(Math.random()*100));
	 	animal[4].setStrengthLevel((int)(Math.random()*100));

		animal[0].setHungerLevel((int)(Math.random()*10));
 	    animal[1].setHungerLevel((int)(Math.random()*10));
 		animal[2].setHungerLevel((int)(Math.random()*10));
 		animal[3].setHungerLevel((int)(Math.random()*10));
 		animal[4].setHungerLevel((int)(Math.random()*10));
}
 public void fight()
 {	
 	Scanner in=new Scanner(System.in);
 	String fight;
 	boolean a = false;
 	int count = 0;
 	System.out.println("FIGHT BEGIN IN THE FOREST "+"\n **********************");

 	do{
 	        int j=(int)(Math.random()*5);
 			int k=(int)(Math.random()*5);
 			if(animal[k]!=null&&animal[j]!=null)
 			{

 			if(j!=k)
 			{
 			a = animal[j].fight(animal[k]);
 			if(a==true)
 			{
 			animal[j] = null;
 			}
 			else
 			{
 			animal[k] = null;
 			}
 			}
 			count = 0;
 			for(int i=0;i<5;i++)
 			{
 				if(animal[i]==null){
 					count++;
 				}

 			}
 			
	 	}

	 }
	while(count<4);
	for(int i=0;i<5;i++)
	{
		if(animal[i]!=null)
		{  
			System.out.println("*************************************");
		   System.out.println("*"+animal[i].getName()+" "+"Roaming Around In The Forest !*"+
				            "\n*************************************");
		}
	}
	
}
}

 			