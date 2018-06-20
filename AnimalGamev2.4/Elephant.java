public class Elephant extends HerbivoreAnimal
	{
		 Elephant(int numID,int strength,int hunger)
			{
				 setAlive(true);
				 setID("Elephant "+String.valueOf(numID));
				 setStrength(strength);
				 setHunger(hunger);
			}
	}