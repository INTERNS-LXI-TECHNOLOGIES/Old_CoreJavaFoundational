import java.util.*;
public class Animal
{
	String name;
	int animalStrength;
	int l1,l2,l3,i;
public void setName(String name)
{
	this.name=name;
}
public void setAnimalStrength(int animalStrength)
{
	this.animalStrength=animalStrength;
}
public String getName()
{
	return name;
}
public int getAnimalStrength()
{
	return animalStrength;
}
public boolean fight(Animal animal)
{


	System.out.println("FIGHT BEGINS..........");
	System.out.println(name+ " and " +animal.name+ " are fighting ");
	if(animalStrength>animal.animalStrength)
	{
		System.out.println(name+" WINS!... ");
		System.out.println(animal.name+" LOOSES!....");
		return true;
	}
	else if(animalStrength<animal.animalStrength)
	{
		System.out.println(animal.name+" WINS!... ");
		System.out.println(name+" LOOSES!... ");
		return false;
	}
	return false;


	
}
}