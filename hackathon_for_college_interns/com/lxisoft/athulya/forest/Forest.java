package com.lxisoft.athulya.forest;
import java.util.ArrayList;
import java.util.Scanner;
import com.lxisoft.athulya.forest.animals.Animal;


public class Forest
{
	private ArrayList<Animal> animals=null;
	Animal animal=new Animal();
	Scanner scan=new Scanner(System.in);
	

	
	public void startGame()
	{
		System.out.println("START GAME");
		animal.setAnimalName("LION");
		System.out.println(animal.getAnimalName());
		
		
		//implement code here
	}
	
	public void meetAnimals(Animal animal1,Animal animal2)
	{
		
	}//@Todo implment method if necessary
	
	/*public animal getWinner()
	{
		return animal;
	}	//@Todo implment method if necessary*/
}