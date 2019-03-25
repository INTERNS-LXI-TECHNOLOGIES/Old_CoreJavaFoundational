import java.util.*;
class Lion extends Animal
{	
    Random rand= new Random();
	void  getData()
	{
		 name="Lion";
     animal_strength=rand.nextInt(700)+100;
     
	}
}
