import java.util.*;
class Deer extends Animal
{	
    Random rand= new Random();
	void getData()
	{
	 name="Deer";
     animal_strength=rand.nextInt(700)+100;
     
	}
}