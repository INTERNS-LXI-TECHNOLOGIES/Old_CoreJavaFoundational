public class Lion extends Animals
    {
         Lion(int numID)
			{
				 setID("Lion "+String.valueOf(numID));
				 setRoam(2); 
				 setCarnivore(true);
				 setStrength(7,10);  //Random between 7 and 10
				 setHunger(2);  //Random value between 0 and 2
			}
	}