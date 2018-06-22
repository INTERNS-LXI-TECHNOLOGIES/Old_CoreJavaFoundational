package com.lxisoft.animalgame.test;
import com.lxisoft.animalgame.animalproperty.Animal;
import com.lxisoft.animalgame.forest.Forest;
import java.util.Scanner;
public class TDD 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int i,j,k,l,total,dead,alive=0;
		char ch ;
		Animal[][] Location= new Animal[10][10];
		do
		{
			System.out.println("\nEnter the no.of Lion,Tiger,Deer and Zebra : ");
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			l = sc.nextInt();
			total = i+j+k+l;
			dead = 0;
			alive = 0;
			Forest f = new Forest(i,j,k,l);
			Location = f.AnimalPos();

		//Testing placement of animals
			f.AnimalPresence(Location);
			Location = f.fight(Location);
			for(i=0;i<10;i++)
				for(j=0;j<10;j++)
					if(Location[i][j]!=null)
						alive++;
			dead = total - alive;
			System.out.println("\n\nTOTAL NO OF ANIMALS ="+total+"\nNO.OF ANIMALS STILL ALIVE = "+alive+"\nNO OF ANIMALS DEAD ="+dead+"\n\n");
		//Checking the final result
			f.AnimalPresence(Location);
			System.out.println("\n\nDO YOU WANT TO PLAY AGAIN yes/no?");
			ch = sc.next().charAt(0);
		}while(ch=='y');
	}
}
