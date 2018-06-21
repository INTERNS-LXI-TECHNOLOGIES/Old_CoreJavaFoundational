import java.io.*;
import java.util.*;
public class Herbivorousanimal extends Animal implements Herbivorous
{
public void grasseat()
{
	if(hunger>5)
	{
		System.out.println("\n"+this.name+"\t Eating grass");
	}
}	
}