public class Tiger extends Animals
	{
		 Tiger(int numID)
			{  
				 setID("Tiger "+String.valueOf(numID));
				 setRoam(3); 
				 setCarnivore(true);
				 setStrength(6,9);  //Random between 7 and 10
				 setHunger(2);  //Random value between 0 and 2
			} 
	}