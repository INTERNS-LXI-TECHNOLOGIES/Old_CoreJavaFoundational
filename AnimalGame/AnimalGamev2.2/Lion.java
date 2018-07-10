public class Lion extends CarnivoreAnimal
    {
         Lion(int numID,int strength,int hunger)
			{
				 setID("Lion "+String.valueOf(numID));
				 setRoam(2); 
				 setStrength(strength);
				 setHunger(hunger);
			}
	}