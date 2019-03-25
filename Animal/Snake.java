import java.util.*;
class Snake extends Animal
{	
    Random rand= new Random();
	void getData()
	{
		 name="Snake";
     animal_strength=rand.nextInt(700)+100;
     
	}
}