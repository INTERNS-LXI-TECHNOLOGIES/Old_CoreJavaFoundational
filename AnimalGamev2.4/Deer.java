public class Deer extends HerbivoreAnimal
    {
         Deer(int numID,int strength,int hunger)
			{
				 setAlive(true);
				 setID("Deer "+String.valueOf(numID));
				 setStrength(strength);
				 setHunger(hunger);
			}
	}