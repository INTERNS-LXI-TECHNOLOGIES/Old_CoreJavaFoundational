public class Deer extends Animals
    {
         Deer(int numID)
			{
				 setID("Deer "+String.valueOf(numID));
				 setCarnivore(false);
				 setStrength(3,6);  //Random between 3 and 6
			}
	}