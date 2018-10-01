
/*
	void moveTo(() - > Moves animal from one position to another
*/

public abstract class Animal
{	
	int id;
	
	int pos_x , pos_y;
	
	int size;
	
	AnimalType type;
	
	int hungry_level;
	
	double strength;
	
	Animal()
	{
		
	}

	public void moveTo(int[] coords)
	{
		pos_x = coords[0];
		pos_y = coords[1];
	}
	
	abstract void printDetails();
}	