import java.util.*;
public class Animal
{
	String name;
	int animalStrength;
	int locationX;
	int locationY;
	int l1,l2,l3,i;
public void setName(String name)
{
	this.name=name;
}
public void setAnimalStrength(int animalStrength)
{
	this.animalStrength=animalStrength;
}
public void setLocationX(int locationX)
{
	this.locationX=locationX;
}
public void setLocationY(int locationY)
{
	this.locationY=locationY;
}
public String getName()
{
	return name;
}
public int getAnimalStrength()
{
	return animalStrength;
}
public int getLocationX()
{
	return locationX;
}
public int getLocationY()
{
	return locationY;
}

	public boolean fight(Animal animal)
	{
		if(this instanceof Carnivores)
		{	
			if(animal.getLocationX()-getLocationX()<=2 && animal.getLocationY()-getLocationY()<=2)
			{
				if(animal instanceof Carnivores)
				{
					System.out.println("\n"+name+ " and " +animal.name+ " are fighting ");
					if(animalStrength>animal.animalStrength)
					{
						System.out.println(name+" WINS!... ");
						System.out.println(animal.name+" LOOSES!....");
						System.out.println("***************");
						return true;
					}
					else 
					{
						System.out.println(animal.name+" WINS!... ");
						System.out.println(name+" LOOSES!... ");
						System.out.println("***************");
						return false;
					}
				}
			}
		}
		return false;
 	}

	public boolean eat(Animal animal)
	{
		if(animal.getLocationX()-getLocationX()<=2 && animal.getLocationY()-getLocationY()<=2)
		{
			if(animal instanceof Herbivores)
			{
				if(animalStrength>animal.animalStrength)
				{
					System.out.println("\n"+name+" Try to eat "+animal.name);
					System.out.println(name+" ate "+animal.name);
					System.out.println("***************");
					return true;
				}
				else 
				{
					System.out.println("\n"+name+" hunting "+animal.name);
					System.out.println(animal.name+" Escaped from "+name);
					animal.setAnimalStrength(animal.getAnimalStrength()-10);
					System.out.println(animal.name+" Ran away... ");
					System.out.println("****************");
					return false;
				}
			}
		}
	return true;
	}
	public boolean meet(Animal animal)
	{
		if(animal.getLocationX()-getLocationX()<=2 && animal.getLocationY()-getLocationY()<=2)
		{
			if(animal instanceof Herbivores)
			{
				if(animalStrength>animal.animalStrength)
				{
					System.out.println("\n"+name+" meets "+animal.name);
					System.out.println(name+" ran away ");
					return true;
				}
				else
				{
					System.out.println("\n"+animal.name+" meets "+name);
					System.out.println(animal.name+" ran away ");
					return false;
				}
			}
		}
	return true;
	}
}
	