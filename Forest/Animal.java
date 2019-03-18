import java.util.*;
class Animal
{
	String name;
	int animalStrength;
void fight(Tiger tiger,Rabbit rabbit,Bear bear,Lion lion)
{
	if(tiger.animalStrength>rabbit.animalStrength)
	{
		if(tiger.animalStrength>lion.animalStrength)
		{
			if(tiger.animalStrength>bear.animalStrength)
			{
				System.out.println("tiger wins");
			}
	            else
	        {
	            System.out.println("bear wins");
			}
		}
		else if(rabbit.animalStrength>lion.animalStrength)
		{
			if(rabbit.animalStrength>bear.animalStrength)
			{
				System.out.println("rabbit wins");
			}
				else
			{
				System.out.println("bear wins");
			}

			}
		}
	else if(lion.animalStrength>bear.animalStrength)
	{
		System.out.println("lion wins");
	}
	else 
	{
		System.out.println("bear wins");
	}
}

}