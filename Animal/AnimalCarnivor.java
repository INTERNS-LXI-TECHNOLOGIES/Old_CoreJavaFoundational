import java.util.*;
public class AnimalCarnivor extends Animal implements Carnivor 
{
	public void eat()
	{
		System.out.print("Meat");
	}
	public String fight(Animal animal)
	{
		String r=null;
		
		if((this instanceof Carnivor) && (animal instanceof Carnivor))
		{
			System.out.println("\n ***Fight Begins***");
			animal.strengthLevel=animal.strengthLevel-10;
			strengthLevel=strengthLevel-10;
			r=(strengthLevel<=0)?name:null;
			r=(animal.strengthLevel<=0)?animal.name:null;
		}
		else if((this instanceof Herbivor) && (animal instanceof Herbivor))
		{
			System.out.println("\n---Goes Away!---");
			animal.strengthLevel=animal.strengthLevel-10;
			strengthLevel=strengthLevel-10;
			r=(strengthLevel<=0)?name:null;
			r=(animal.strengthLevel<=0)?animal.name:null;
		}
		else
		{
			System.out.println("\n***!!Hunt begins!!***");
			if(animal.strengthLevel>strengthLevel)
			{
				if(animal instanceof Herbivor)
				{
					System.out.println(animal.name+"  Escaped");
					animal.strengthLevel=animal.strengthLevel-10;
				}
				else
				{
				System.out.println(animal.name +"   !!!!Win!!!!");	
				r=name;
				}
			}
			else
			{
				if(this instanceof Herbivor)
				{
					System.out.println(name+" Escaped");
					strengthLevel=strengthLevel-10;
				}
				else
				{
					System.out.println(name +"  Win!!");
					r=animal.name;
				}
			}
		}return r;
	}
}