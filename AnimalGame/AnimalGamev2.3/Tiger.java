public class Tiger extends CarnivoreAnimal
	{
		 Tiger(int numID,int strength,int hunger)
			{  
				 setAlive(true);
				 setID("Tiger "+String.valueOf(numID));
				 setRoam(3); 
				 setStrength(strength);
				 setHunger(hunger);
			} 
	}