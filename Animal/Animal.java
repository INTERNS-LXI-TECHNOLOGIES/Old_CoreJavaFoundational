import java.util.*;
public class Animal
{
	String name;
	int strengthLevel;
	public Integer fight(Animal animal)
	{
		Integer r=null;
		

		if((this instanceof Carnivor) && (animal instanceof Carnivor))
		{
			System.out.println("\n ***Fight Begins***");

			animal.strengthLevel=animal.strengthLevel-10;
			strengthLevel=strengthLevel-10;
			r=(strengthLevel<=0)?0:null;
			r=(animal.strengthLevel<=0)?1:null;

		}
		else if((this instanceof Herbivor) && (animal instanceof Herbivor))
		{
			System.out.println("\n---Goes Away!---");
			animal.strengthLevel=animal.strengthLevel-5;
			
			strengthLevel=strengthLevel-5;
			
			r=(strengthLevel<=0)?0:null;
			r=(animal.strengthLevel<=0)?1:null;
			
		}
		else
		{
			System.out.println("\n***!!Hunt begins!!***");
			if(animal.strengthLevel>strengthLevel)
			{
				if(animal instanceof Herbivor)
				{
					System.out.println(animal.name+"  Escaped");
					animal.strengthLevel=animal.strengthLevel-5;
					
				}
				else
				{
				System.out.println(animal.name +"   !!!!Win!!!!");	
				r=0;
				}

			}
			else
			{
				if(this instanceof Herbivor)
				{
					System.out.println(name+" Escaped");
					strengthLevel=strengthLevel-5;
				}
				else
				{
					System.out.println(name +"  Win!!");
					r=1;
				}
			}
			
		}return r;
	}
}