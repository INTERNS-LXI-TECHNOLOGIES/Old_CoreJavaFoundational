package com.lxisoft.Amal.forest;
/**
* @author Amal
* @version 1.1
* @since   21-09-2018 
*this class is to create forest
*contain methods to create,set and start game
*/
import com.lxisoft.Amal.forest.animals.Animalam;
import com.lxisoft.Amal.forest.animals.Lionam;
import com.lxisoft.Amal.forest.animals.Rabitam;
import java.util.*;
import java.util.ArrayList;
import java.lang.Math.*;
public class Forestam
{
	int noOfAnim;
	int i;
	
	public void SetForest()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number of animals"); 
    noOfAnim=scan.nextInt();
	createForest();
	
}
   public void createForest()
   {
	Scanner scann=new Scanner(System.in);   
	ArrayList<Animalam> anim=new ArrayList<Animalam>();
	Animalam[] animals=new Animalam[100];
	System.out.println("1.Lion\n2.Rabbit");
	for(i=0;i<noOfAnim;i++)
	{
			System.out.println("Enter the Animal option::");
            int opt=scann.nextInt();
	switch(opt)
	{
		case 1: 
		{
			animals[i]= new Lionam();
			anim.add(animals[i]);
			animals[i].setName("Lion");
		}
		 break;
		 case 2:
		 {
			animals[i]= new Rabitam();
			anim.add(animals[i]);
			animals[i].setName("Rabit");
		 }
		 break;
			 
		default: System.out.println("invalid");
	
		
	
   }
	}
	public Boolean startGame() 
	{
		
		//implement code here
	//return null;
	//}
	/*public abstract meetanimals(Animalam a,Animalam b);//@Todo implment method if necessary
	{
		
	}
	public abstract getWinner(); //@Todo implment method if necessary
	{
		
		
	}*/
	
	}
}
