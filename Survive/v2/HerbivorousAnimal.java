import java.io.*;
import java.util.*;
public class HerbivorousAnimal extends Animal implements Herbivorous
{
	public void grassEat()
	{
		if(hunger>5)
		{
			System.out.println("\n"+this.name+"\tEating grass ");
		}
	}
}